package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.time.LocalTime;

@Configuration
public class CarFactory {

    @Bean
    @Scope("prototype")
    public Car choseCar(String season, LocalTime time) {
        boolean turnOn = time.isAfter(LocalTime.of(20,00, 00));
        boolean turnOff = time.isBefore(LocalTime.of(06, 00, 00));
        if(season.equals("summer")) {
            return new Cabrio();
        } else if (season.equals("spring") || season.equals("autum")) {
            return new Sedan();
        }
            else {
                return new SUV();
            }

        }

    }

