package app.processor.filter;

import app.model.Accounts;
import app.model.account.Account;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@NoArgsConstructor
public class DataFilter {
    private static List<Account> accountList;
    public static Accounts filter(Accounts accounts){
        accountList = accounts.getAccountsList();
        return (Accounts) accounts;
    }
}
