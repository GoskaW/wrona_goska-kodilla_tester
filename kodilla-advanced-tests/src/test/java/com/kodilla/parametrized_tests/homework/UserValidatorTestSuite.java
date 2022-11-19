package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"n", "11", "--","??#", "l"})
    public void shouldReturnIfUsernameIsFalse(String username) {
        boolean result = UserValidator.validateUsername(username);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"bbb.b","a@a", "a@.pl", "@z.pl"})
    public void shouldReturnIfEmailIsFalse(String email) {
        boolean result = UserValidator.validateEmail(email);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource( strings = {"user1", "UsER", "User_12", "UserS.S_12"})
    public void shouldReturnIfUserNameIsTrue(String username) {
        boolean result = UserValidator.validateUsername(username);
        assertTrue(result);

    }

    @ParameterizedTest
    @ValueSource(strings = {"anna.o@op.pl", "ryszardW@gmail.com", "klara33@wp.pl", "jeremi_przybora@gmail.com"})
    public void shouldReturnIfEmailIsTrue(String email){
        boolean result = UserValidator.validateEmail(email);
        assertTrue(result);
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnIfUserNameIsEmptyOrNull(String username) {
        assertFalse(userValidator.validateUsername(username));
    }
    @ParameterizedTest
    @EmptySource
    public void shouldReturnIfEmailIsEmpty(String email) {
        assertTrue(userValidator.validateEmail(email));
    }

}
