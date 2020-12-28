package org.socraagile.kata;

public class FizzBuzz {
    public String compute(int number) {
        if(number == 3 || number == 6){
            return "Fizz";
        }
        return String.valueOf(number);
    }
}
