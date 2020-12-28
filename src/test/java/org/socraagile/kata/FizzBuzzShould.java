package org.socraagile.kata;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;


public class FizzBuzzShould {

    @DisplayName("Return the string of the number")
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4})
    void return_the_string_of_the_number(int number) {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.compute(number);

        assertThat(result).isEqualTo(String.valueOf(number));
    }

    @DisplayName("Return Fizz when number is multiple of 3")
    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9})
    void return_Fizz_when_number_is_multiple_of_3(int number) {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.compute(number);

        assertThat(result).isEqualTo("Fizz");
    }

    @DisplayName("Return Buzz when number is 5")
    @Test
    void return_Buzz_when_number_is_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 5;

        String result = fizzBuzz.compute(number);

        assertThat(result).isEqualTo("Buzz");
    }

}
