package com.kodilla;

public class Application {
    public static void main(String[] args) {
        Application2 application2 = new Application2("Adam", 40.5, 178);
        System.out.println("Imię" + application2.name + "Wiek" + application2.age + "Wzrost" + application2.height);
        application2.checkAdam ();
    }
}



