package app.filter;

import app.model.account.Account;
import lombok.NoArgsConstructor;
import nl.garvelink.iban.Modulo97;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
public class AccountFilter implements AccountFilterRepository{
    @Override
    public List<Account> checkCurrency(List<Account> accountList) {
        accountList.removeIf(account -> !account.getCurrency().equals("PLN"));
        return accountList;
    }

    @Override
    public List<Account> checkBalance(List<Account> accountList) {
        accountList.removeIf(account -> account.getBalance()<0);
        return accountList;
    }

    @Override
    public List<Account> checkClosingDate(List<Account> accountList) {
        accountList.removeIf(account -> {
            try {
                Date closing = new SimpleDateFormat("yyyy-MM-dd").parse(account.getClosingDate());
                Date today = new Date();
                return !closing.after(today);
            } catch (ParseException e) {
                e.printStackTrace();
                return false;
            }
        });
        return accountList;
    }

    @Override
    public List<Account> checkIban(List<Account> accountList) {
        accountList.removeIf(account -> Modulo97.verifyCheckDigits(account.getIban()));
        return accountList;
    }
}
