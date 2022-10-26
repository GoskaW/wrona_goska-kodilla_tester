package com.kodilla;

import java.util.Scanner;
public class UserDialogs {
    public static String getUsername() {
        Scanner scanner = new Scanner(System.in);                 // [1] klasa scanner wbudowana w jave
        while (true) {                                            // [2]
            System.out.println("Choose your color:");                // [3]
            String name = scanner.nextLine().trim();               // [4] metoda pozwalająca na wpisanie danych + trim jako ścięcie spacji
            if (name.length() >= 1) {                              // [5]
                return name;                                        // [6]
            }
            System.out.println("Sorry, colour not found. Try again.");
        }
    }
}
