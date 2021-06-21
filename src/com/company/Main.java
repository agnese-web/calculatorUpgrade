package com.company;

public class Main {

    public static void main(String[] args) {
	    double firstValue;
	    double secondValue;
	    double answer;

	    //initialize variables
        firstValue = 22;
        secondValue = 7;
        String operator = "*";

	    System.out.println(doArithmetic(firstValue, secondValue, operator));

//	    switch (operator) {
//            case "+":
//                answer = firstNum + secondNum;
//                System.out.println(answer);
//                break;
//            case "-":
//                answer = firstNum - secondNum;
//                System.out.println(answer);
//                break;
//            case "*":
//                answer = firstNum * secondNum;
//                System.out.println(answer);
//                break;
//            case "/":
//                answer = firstNum / secondNum;
//                System.out.println(answer);
//                break;
//            default:
//                System.out.println("Enter a valid operator");
//                break;
//        }
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

    // create a method that checks two numbers and uses switch to
    // return max, min
}
