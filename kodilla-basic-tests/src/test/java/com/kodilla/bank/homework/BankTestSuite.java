package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

public class BankTestSuite {

    @Test
    public void shouldCheckAllBalance(){
        Bank bank = new Bank();
        CashMachine lubicz = new CashMachine();
        CashMachine rynek = new CashMachine();
        CashMachine slawkowska = new CashMachine();
        bank.add(lubicz);
        bank.add(rynek);
        bank.add(slawkowska);
        lubicz.add(350);
        rynek.add(250);
        slawkowska.add(-150);
    }
}



