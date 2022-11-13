package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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


        assertEquals(450, bank.getAllBalance());
    }

    @Test
    public void shouldCheckAllSumOfWithdrawls(){
        Bank bank = new Bank();
        CashMachine lubicz = new CashMachine();
        CashMachine rynek = new CashMachine();
        CashMachine slawkowska = new CashMachine();
        bank.add(lubicz);
        bank.add(rynek);
        bank.add(slawkowska);

        lubicz.add(350);
        rynek.add(-250);
        slawkowska.add(-150);

        assertEquals(-400, bank.getAllSumOfWithdrawls());

    }

    @Test
    public void shouldCheckAllSumOfPayment(){
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

        assertEquals(600, bank.getAllSumOfPayment());
        }

        @Test
    public void shouldCheckAllPaymentAverage(){
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

            assertEquals(1,bank.getAllPaymentAverage());
        }

        @Test
    public void shouldCheckAllWithdwarlAverage(){
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

            assertEquals(-1, bank.getAllWithdwarlAverage());

        }


}



