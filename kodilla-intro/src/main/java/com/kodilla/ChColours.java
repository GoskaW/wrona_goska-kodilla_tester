package com.kodilla;

public class ChColours {

    enum NameColour {
        BLUE,
        GREEN,
        RED,
        PINK,
        WHITE
    }

    public String colours() {
        String userSelected = Colours.getUserSelection();
        String letter = String.valueOf(Colours.getLetter());
        NameColour colour = NameColour.WHITE;

        switch (colour) {
            case BLUE:
               System.out.println("Blue");
                break;
            case GREEN:
                System.out.println("Green");
                break;
            case RED:
                System.out.println("Red");
                break;
            case PINK:
                System.out.println("Pink");
                break;
            case WHITE:
                System.out.println("White");
                break;
        }
        return userSelected;
    }
}
