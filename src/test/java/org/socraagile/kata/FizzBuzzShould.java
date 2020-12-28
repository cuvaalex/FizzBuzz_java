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

    @DisplayName("Return Fizz when number is 3")
    @Test
    void return_Fizz_when_number_is_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 3;

        String result = fizzBuzz.compute(number);

        assertThat(result).isEqualTo("Fizz");
    }

}
