package app.filter;

import app.model.Accounts;
import app.model.account.Account;
import lombok.RequiredArgsConstructor;
import java.util.List;

@RequiredArgsConstructor
public class DataFilter implements AccountFilter {
    public static Accounts filter(Accounts accounts){
        List<Account> accountList = accounts.getAccountsList();

        return accounts;
    }


}
