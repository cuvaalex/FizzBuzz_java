package org.socraagile.kata;

public class FizzBuzz {
    public String compute(int number) {
        if(number % 3 == 0){
            return "Fizz";
        }
        if(number == 5 || number == 10){
            return "Buzz";
        }
        return String.valueOf(number);
    }
}
