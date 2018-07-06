package ru.raiffeisen.cources.accounts;

public class Account {
    public String accNum;
    public double balance;

    public Account(String accNum, double sum) {
        this.accNum = accNum;
        this.balance = sum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
