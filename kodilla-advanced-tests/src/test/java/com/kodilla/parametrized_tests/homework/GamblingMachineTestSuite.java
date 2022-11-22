package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GamblingMachineTestSuite {

    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/correctNumbers.csv", numLinesToSkip = 1)
    public void shouldReturnIfNumbersAreCorrect(String excepted) throws InvalidNumbersException{
        Set<Integer> correctNumbers = new HashSet<>();
        int result = gamblingMachine.howManyWins(correctNumbers);
        assertEquals(excepted,result);





    }
}
