package com.kodilla.bank.homework;

public class Bank {
    private int[] values;
    private int size;

    public Bank() {
        this.size = 0;
        this.values = new int[0];
    }

    public void add(int value) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(values, 0, newTab, 0, values.length);
        newTab[this.size - 1] = value;
        this.values = newTab;
    }
    public int[] getPayment() {
        return values;
    }
    public int[] getPaycheck() {
        return values;
    }
}
