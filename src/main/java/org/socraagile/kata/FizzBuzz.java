package org.socraagile.kata;

public class FizzBuzz {
    public String compute(int number) {
        String message = "";
        if(number % 3 == 0){
            message += "Fizz";
        }
        if(number % 5 == 0){
            message += "Buzz";
        }
        if(message.isEmpty()){
            return String.valueOf(number);
        }
        return message;
    }
}
