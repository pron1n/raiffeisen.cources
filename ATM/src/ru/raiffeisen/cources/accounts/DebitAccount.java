package ru.raiffeisen.cources.accounts;

public class DebitAccount extends Account implements IAccountDescription {
    protected double debetPercent;

    public DebitAccount(String accNum, double balance, double debetPercent) {
        super(accNum, balance);
        this.debetPercent = debetPercent;
    }

    public double getDebetPercent() {
        return debetPercent;
    }

    public void setDebetPercent(float debetPercent) {
        this.debetPercent = debetPercent;
    }

    @Override
    public String getAccountDescription() {
        return "Дебетовый счет, номер: " + accNum;
    }
}
