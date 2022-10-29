package com.kodilla.abstracts.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }
        Calculator calculator2 = new Calculator();
        int a2 = 25;
        int b2 = 7;
        int subResult = calculator.subtract(a2, b2);
        boolean correct2 = ResultChecker.assertEquals(18,subResult);
        if (correct2) {
            System.out.println("Metoda substract działa poprawnie dla liczb " + a2 + " i " + b2);
        }else {
            System.out.println("Metoda substract działa niepoprawniepoprawnie dla liczb " + a2 + " i " + b2);
        }
        Calculator calculator3 = new Calculator();
        double a3 = 4;
        double b3 = 2;
        double power = Math.pow(a3,b3);
        boolean correct3 = ResultChecker.assertEquals2(16,power);
        if (correct3) {
            System.out.println("Metoda potęgowania działa poprawnie dla liczb " + a3 + " i " + b3);
        } else {
            System.out.println("Metoda potęgowania działa niepoprawnie dla liczb " + a3 + "oraz " + b3);
        }
    }
}
