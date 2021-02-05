package app.filter;

public interface AccountFilter {

    boolean checkCurrency();

    boolean checkBalance();

    boolean checkClosingDate();
}
