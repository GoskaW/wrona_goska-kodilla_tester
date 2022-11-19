package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {

    private static Stream<Arguments> provideDataForBMI(){
        return Stream.of(
                Arguments.of(new Person (150,45),"Underweight"),
                Arguments.of(new Person (155, 55), "Normal (healthy weight)"),
                Arguments.of(new Person(168,68), "Normal (healthy weight)"),
                Arguments.of(new Person (170, 75), "Normal (healthy weight)"),
                Arguments.of(new Person (175, 90), "Overweight"),
                Arguments.of (new Person (180, 120), "Overweight"),
                Arguments.of( new Person (165,90), "Obese Class I (Moderately obese)"
                ));

    }
}
