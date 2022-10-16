package com.kodilla;

public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price < 1000) {
            System.out.println("The price is good");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight < 600) {
            System.out.println("This notebook is very light.");
        } else if (this.weight > 1200 && this.weight < 1800) {
            System.out.println("The notebook is average weight");
        } else {
            System.out.println("This notebook is very heavy.");
        }
    }

    public void checkYear() {
        if (this.year < 2010) {
            if (this.price > 1000) {
                System.out.println("This notebook is cheap and not that old.");
            } else if (this.weight < 1600) {
            } else if (this.year < 2000 ) {
                System.out.println("This notebook is too old too heavy.");
            } else {
                System.out.println("There are cheaper and younger notebooks");
            }
        }
    }
}


