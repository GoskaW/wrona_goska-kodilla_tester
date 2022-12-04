package com.kodilla.spring.basic.spring_configuration;

import com.kodilla.spring.basic.spring_configuration.homework.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CarFactoryTestSuite {

@Test
    public void lightsTurnOn(){
    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
    Car car = (Car) context.getBean("choseCar");
    boolean lights = car.hasHeadlightsTurnedOn();
    Assertions.assertTrue(lights);

}

}
