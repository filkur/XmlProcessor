package app.filter;

import app.model.account.Account;

import java.util.List;

/**
 * Interface that initializes the methods on which validation will be based
 */
public interface AccountFilterRepository {

    boolean checkCurrency(List<Account> accountList);

    boolean checkBalance(List<Account> accountList);

    boolean checkClosingDate(List<Account> accountList);

    boolean checkIban(List<Account> accountList);
}
