package ru.raiffeisen.cources.accounts;

public class CurrentAccount extends Account implements IAccountDescription {

    public CurrentAccount(String accNum, double balance) {
        super(accNum, balance);
    }

    @Override
    public String getAccountDescription() {
        return "Текущий счет, номер: " + accNum;
    }
}
