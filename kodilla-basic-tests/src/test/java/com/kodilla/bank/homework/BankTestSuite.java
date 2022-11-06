package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTestSuite {

    @Test
    void getAllBalance() {
    }

    @Test
    void getAllSumOfWithdrawls() {
    }

    @Test
    void getAllSumOfPayment() {
    }

    @Test
    void getAllPaymentAverage() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(300);
        cashMachine.add(-500);
        cashMachine.add(650);

        int[] transactions = cashMachine.getTransactions();
        Bank bank = new Bank();
        assertEquals(475, bank.getAllPaymentAverage());

    }
}