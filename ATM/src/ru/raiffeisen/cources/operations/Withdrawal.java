package ru.raiffeisen.cources.operations;

import ru.raiffeisen.cources.accounts.Account;

public class Withdrawal {

    public void getCash(Account account, double howMuch) {
        account.setBalance(account.balance - howMuch);
    }

    public void getAllCash(Account account) {
        account.setBalance(0);
    }
}
