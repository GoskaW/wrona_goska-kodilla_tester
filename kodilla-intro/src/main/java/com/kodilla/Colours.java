package com.kodilla;

import java.util.Scanner;

public class Colours {

    public static String getUserSelection() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter first letter of the colour ");
            String colour = scanner.nextLine().trim().toUpperCase();
            switch (colour) {
                case "B": return String.valueOf(ChColours.NameColour.BLUE);
                case "G": return String.valueOf(ChColours.NameColour.GREEN);
                case "R": return String.valueOf(ChColours.NameColour.RED);
                case "P": return String.valueOf(ChColours.NameColour.PINK);
                case "W": return String.valueOf(ChColours.NameColour.WHITE);

                default:
                    System.out.println("Wrong first letter. Try again.");
            }
        }
            }

    public static int getLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first letter ");
        String letter = String.valueOf(scanner.nextInt());
        return Integer.parseInt(letter);
    }




}

