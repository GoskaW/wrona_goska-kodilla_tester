package com.kodilla.bank.homework;
public class Bank {
    private CashMachine[] cashMachines;
    private int size;

    public Bank(CashMachine[] cashMachines, int size) {
        this.cashMachines = cashMachines;
        this.size = 0;
    }

    public int getAllBalance() {                                    //całkowity bilans
        int allBalance = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            CashMachine cashMachine = cashMachines[i];
            allBalance += cashMachine.getBalance();
        }
        return allBalance;
    }

    public int getAllSumOfWithdrawls() {                            //wszystkie wypłaty
        int allSumOfWithdrawals = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            allSumOfWithdrawals += cashMachines[i].getSumOfWithdrawls();
        }
        return -allSumOfWithdrawals;
    }

    public int getAllSumOfPayment() {                           //wpłaty total
        int allSumOfPayment = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            allSumOfPayment += cashMachines[i].getSumOfPayment();
        }
        return allSumOfPayment;
    }

    public double getAllPaymentAverage(){
        int counterPayment = getAllSumOfPayment();   // zmodyfikowałam metodę z klasy Grades, ale nie wiem czy zrobiłam to dobrze.
        if (counterPayment == 0); {                 // i tu się zacięłam, przetestowałam metodę, ale wyskoczył mi błąd unreachable statment double sum = 0;
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            sum += cashMachines[i].getSumOfPayment();
        }
        return sum / counterPayment;

    }


}








