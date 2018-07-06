package ru.raiffeisen.cources.operations;

import ru.raiffeisen.cources.accounts.Account;

public class Deposit {

    public void deposit(Account account, double howMuch) {
        account.setBalance(account.balance + howMuch);
    }
}
