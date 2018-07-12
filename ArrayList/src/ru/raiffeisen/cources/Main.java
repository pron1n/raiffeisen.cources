package ru.raiffeisen.cources;

public class Main {

    public static void main(String[] args) {
        
        Object[] array = {1, 2, 3};

        ArrayList arrayList = new ArrayList(array);

        System.out.println(arrayList.toString() + "\n");

        System.out.println("arrayList.size() returns:\n" + arrayList.size());
        System.out.println("arrayList.get(1) returns:\n" + arrayList.get(1));

        arrayList.remove(1);

        System.out.println("arrayList.remove(1) returns:\n" + arrayList.toString());


    }
}
