package ru.raiffeisen.cources;

import ru.raiffeisen.cources.accounts.Account;
import ru.raiffeisen.cources.accounts.CreditAccount;
import ru.raiffeisen.cources.accounts.CurrentAccount;
import ru.raiffeisen.cources.accounts.DebitAccount;
import ru.raiffeisen.cources.operations.Deposit;
import ru.raiffeisen.cources.operations.Withdrawal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите счет:\n1 - Текущий\n2 - Дебетовый\n3 - Кредитный");
        byte accId = scanner.nextByte();

        Account myAcc = new Account("0", 0);

        switch (accId) {
            case 1:
                myAcc = new CurrentAccount("40701810800020009812", 32434.34);
                System.out.println(((CurrentAccount) myAcc).getAccountDescription());
                break;
            case 2:
                myAcc = new DebitAccount("40701810800020004513", 40000.00, 10.0);
                System.out.println(((DebitAccount) myAcc).getAccountDescription());
                break;
            case 3:
                myAcc = new CreditAccount("40702810800020005423", 7435.45, 12.0);
                System.out.println(((CreditAccount) myAcc).getAccountDescription());
                break;

        }

        while (true) {
            System.out.println("\nВыберите действие:\n1 - Показать баланс\n2 - Снять\n3 - Внести\n4 - Перевести между счетами");
            byte actionId = scanner.nextByte();

            switch (actionId) {
                case 1:
                    myAcc.getBalance();
                    System.out.println("Текущий баланс:");
                    System.out.println(myAcc.getBalance());
                    break;
                case 2:
                    Withdrawal withdrawal = new Withdrawal();
                    System.out.println("1 - Снять определенную сумму\n2 - Снять все");
                    actionId = scanner.nextByte();
                    switch (actionId) {
                        case 1:
                            System.out.println("Сколько?");
                            double howMuch = scanner.nextDouble();
                            withdrawal.getCash(myAcc, howMuch);
                            System.out.println("Успешно. Текущий баланс:");
                            System.out.println(myAcc.getBalance());
                            break;
                        case 2:
                            withdrawal.getAllCash(myAcc);
                            System.out.println("Успешно. Текущий баланс:");
                            System.out.println(myAcc.getBalance());
                            break;
                    }
                    break;
                case 3:
                    Deposit deposit = new Deposit();
                    System.out.println("Сколько?");
                    double howMuch = scanner.nextDouble();
                    deposit.deposit(myAcc, howMuch);
                    System.out.println("Успешно. Текущий баланс:");
                    System.out.println(myAcc.getBalance());
                    break;
                case 4:
                    System.out.println("Извините, сервис временно недостунен");
                    break;
            }

        }

    }
}
