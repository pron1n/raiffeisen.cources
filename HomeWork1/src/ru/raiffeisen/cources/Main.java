package ru.raiffeisen.cources;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        private ArrayList resultSet = new ArrayList();

        System.out.println("Введите строки (для заверщения ввода введите пустую строку):");

        String string = scanner.nextLine();

        while (string.length() > 0) {
            for (int i = 0; i < args.length; i++) {
                if (string.toLowerCase().contains(args[i].toLowerCase())) {
                    resultSet.add(string);
                    break;
                }
            }

            string = scanner.nextLine();

        }


        System.out.println("Строки, в которых есть хотя бы одно вхождение хотя бы одного из слов из Program arguments:");

        for (int i = 0; i < resultSet.size(); i++) {
            System.out.println(resultSet.get(i));
        }


    }
}
