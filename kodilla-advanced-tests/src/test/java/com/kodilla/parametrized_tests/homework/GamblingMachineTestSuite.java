package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class GamblingMachineTestSuite {

    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/correctNumbers.csv", numLinesToSkip = 1)
    public void shouldReturnIfNumbersAreCorrect(String numbers) throws InvalidNumbersException{


    }
}
