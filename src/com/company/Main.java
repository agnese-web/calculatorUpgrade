package com.company;

import java.math.MathContext;

public class Main {

    public static void main(String[] args) {
	    double firstValue;
	    double secondValue;
	    double answer;

	    //initialize variables
        firstValue = 22;
        secondValue = 7;
        String operator = "+";
        String get = "min";   // get smallest or greatest value using max/min


	    System.out.println(doArithmetic(firstValue, secondValue, operator));
        System.out.println(maxMin(firstValue, secondValue, get));
    }

    public static double doArithmetic(double firstNum, double secondNum, String operator) {
        double answer = 0;
        switch (operator) {
            case "+":
                answer = firstNum + secondNum;
                return answer;
            case "-":
                answer = firstNum - secondNum;
                return answer;
            case "*":
                answer = firstNum * secondNum;
                return answer;
            case "/":
                answer = firstNum / secondNum;
                return answer;
            default:
                System.out.println("Enter a valid operator");
                break;
        }

        return answer;
    }

    // create a method that checks two values and uses switch to
    // return max or min
   public static double maxMin(double first, double second, String get) {
        double result= 0;
        switch(get) {
            case "max":
                result = Math.max(first, second);
                return result;
            case "min":
                result = Math.min(first, second);
                return result;
            default:
                System.out.println("There was a problem");
                break;
        }
        return result;
   }
}
