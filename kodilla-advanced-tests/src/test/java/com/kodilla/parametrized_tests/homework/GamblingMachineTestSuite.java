package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class GamblingMachineTestSuite {

    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/correctNumbers.csv", numLinesToSkip = 1)
    public void shouldReturnIfNumbersAreCorrect(int a, int b, int c, int d, int e, int f) throws InvalidNumbersException {
        Set<Integer> correctNumbers = new HashSet<>();
        correctNumbers.add(a);
        correctNumbers.add(b);
        correctNumbers.add(c);
        correctNumbers.add(d);
        correctNumbers.add(e);
        correctNumbers.add(f);
        int result = gamblingMachine.howManyWins(correctNumbers);
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(correctNumbers));
    }

    @ParameterizedTest
    @CsvFileSource (resources = "/incorrectNumbers.csv", numLinesToSkip = 1)
    public void shouldReturnIfNumbersAreInncorrect (int a, int b, int c, int d, int e, int f) throws InvalidNumbersException {
        Set<Integer> incorrectNumbers = new HashSet<>();
        incorrectNumbers.add(a);
        incorrectNumbers.add(b);
        incorrectNumbers.add(c);
        incorrectNumbers.add(d);
        incorrectNumbers.add(e);
        incorrectNumbers.add(f);
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(incorrectNumbers));
    }
}
