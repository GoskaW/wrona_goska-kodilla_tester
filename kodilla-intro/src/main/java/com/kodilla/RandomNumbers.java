package com.kodilla;

import java.util.Random;

public class RandomNumbers {
    int min;
    int max;
    int sum;
    Random random = new Random();
    public int draw() {
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(31);
            sum = sum + temp;
            result++;

            if (temp > this.max) {
                this.max = temp;
            }
            if (temp < this.min) {
                this.min = temp;
            }
        }
        return result;
    }
    public int getMax() {
        return this.max;
    }

    public int getMin() {
        return this.min;
    }
    public static void main(String[] args) {
        RandomNumbers random = new RandomNumbers();
        random.draw();
        System.out.println("Min: " + random.getMin());
        System.out.println("Max: " + random.getMax());
    }
    }
            // mam zaimportowaną klasę random, wyciągnęłam zmienne poza metodę main, stworzyłam gettery wyciągające wartości min oraz max. Ale wiem, że coś jest nie tak z metodą, że za każdym razem pokazuje mi 0 oraz 0
