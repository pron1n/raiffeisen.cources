package ru.raiffeisen.cources.operations;

import ru.raiffeisen.cources.accounts.Account;

public class C2C {


    public void transfer(Account fromAcc, Account toAcc, double howMuch) {
        fromAcc.setBalance(fromAcc.balance - howMuch);
        toAcc.setBalance(toAcc.balance + howMuch);
    }

}
