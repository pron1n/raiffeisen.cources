package ru.raiffeisen.cources.atm;

import ru.raiffeisen.cources.atm.model.money.Money;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    ATM atm = new ATM();
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();

        Money money = new Money(val, "RUR");
        atm.getCreditScore().addMoney(money);
    }
}
