package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Car[] cars = new Car[15];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar() {
        Random random = new Random();
        int drawnCar = random.nextInt(3);
        double speed = getRandomSpeed(random);
        if (drawnCar == 0)
            return new Ford(speed);
        else if (drawnCar == 1)
            return new Kia(speed);
        else {
            double b = getRandomSpeed(random);
             return new Opel(speed);

        }


    }
    private static double getRandomSpeed(Random random) {
        return RANDOM.nextDouble() * 100 +1;

    }


}
