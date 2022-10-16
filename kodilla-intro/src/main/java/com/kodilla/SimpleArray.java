package com.kodilla;

public class SimpleArray {
    public static void main(String[] args) {
        String[] names= new String [5];
        names[0] = "Jerry";
                names[1] = "John";
        names[2] = "Clark";
        names[3] = "Edward";
        names[4] = "Jonathan";
               System.out.println(names[3]);
        int numberOfElements = names.length;
        System.out.println(names.length);
        System.out.println("Moja tablica zawiera 5 elementów");

    }
}
