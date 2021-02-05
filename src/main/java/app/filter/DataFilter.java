package app.filter;

import app.model.Accounts;
import app.model.account.Account;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DataFilter {
    public static Accounts filter(Accounts accounts){
        List<Account> accountList = accounts.getAccountsList();
        AccountFilter accountFilter = new AccountFilter();

        accountList = accountFilter.checkBalance(accountList);
        accountList = accountFilter.checkCurrency(accountList);
        accountList = accountFilter.checkClosingDate(accountList);
        accountList = accountFilter.checkIban(accountList);

        Accounts processedAccounts = new Accounts();
        processedAccounts.setAccountsList(accountList);
        return processedAccounts;
    }


}
