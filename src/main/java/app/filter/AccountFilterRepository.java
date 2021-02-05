package app.filter;

import app.model.account.Account;

import java.util.List;

/**
 * Interface that initializes the methods on which validation will be based
 */
public interface AccountFilterRepository {

    List<Account> checkCurrency(List<Account> accountList);

    List<Account> checkBalance(List<Account> accountList);

    List<Account> checkClosingDate(List<Account> accountList);

    List<Account> checkIban(List<Account> accountList);
}
