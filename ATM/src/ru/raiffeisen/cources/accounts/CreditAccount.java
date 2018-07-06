package ru.raiffeisen.cources.accounts;

public class CreditAccount extends Account implements IAccountDescription {
    protected double creditPercent;

    public CreditAccount(String accNum, double balance, double creditPercent) {
        super(accNum, balance);
        this.creditPercent = creditPercent;
    }

    public double getCreditPercent() {
        return creditPercent;
    }

    public void setCreditPercent(float creditPercent) {
        this.creditPercent = creditPercent;
    }

    @Override
    public String getAccountDescription() {
        return "Кредитный счет, номер: " + accNum;
    }
}
