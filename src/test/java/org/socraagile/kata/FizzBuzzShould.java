package org.socraagile.kata;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;


public class FizzBuzzShould {

    private FizzBuzz fizzBuzz = new FizzBuzz();

    @DisplayName("Return the string of the number")
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4})
    void return_the_string_of_the_number(int number) {
        String result = fizzBuzz.compute(number);

        assertThat(result).isEqualTo(String.valueOf(number));
    }

    @DisplayName("Return Fizz when number is multiple of 3")
    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9})
    void return_Fizz_when_number_is_multiple_of_3(int number) {
        String result = fizzBuzz.compute(number);

        assertThat(result).isEqualTo("Fizz");
    }

    @DisplayName("Return Buzz when number is multiple 5")
    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20})
    void return_Buzz_when_number_is_multiple_of_5(int number) {
        String result = fizzBuzz.compute(number);

        assertThat(result).isEqualTo("Buzz");
    }

    @DisplayName("Return FizzBuzz when number is multiple of 5 and 3")
    @ParameterizedTest
    @ValueSource(ints = {15, 30})
    public void return_FizzBuzz_when_number_is_multiple_of_5_and_3(int number) {

        String result = fizzBuzz.compute(number);

        assertThat(result).isEqualTo("FizzBuzz");
    }

}
