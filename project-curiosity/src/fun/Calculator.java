package fun;

import helpers.Keyboard; 
import java.lang.Math;

public class Calculator {
    public static void main(String[] args){
        //Input number 
        double n1, n2;
        double result = 0;
        char isReady = 'y';

        while (isReady == 'y'){
            System.out.println("enter your 1st number: ");
            n1 = Keyboard.readDouble();
            System.out.println("enter your operation: ");
            String op = Keyboard.readString();
            System.out.println("enter your 2nd number: ");
            n2 = Keyboard.readDouble();
            
            System.out.println(operationFunction(op, n1, n2, result));
            System.out.println("--------------------------------------");

            System.out.println("Do you want to restart calculation? (y/n)");
            isReady = Keyboard.readChar();
        }
        
    }
    
    public static double operationFunction(String function, double n1, double n2, double result) {
        switch(function){
            case "counting":
                while (n1 <= n2){
                    result = n1++;
                    if(result != n2){
                        System.out.println(result);
                    }
                }
                break;
            case "+":
                result = n1 + n2;
                break;
            case "-":
                result = n1 - n2;
                break;
            case "*":
                result = n1 * n2;
                break;
            case "/":
                result = n1 / n2;
                break;
            case "%":
                result = (n1 / n2) * 100;
                break;
            case "remainder":
                result = n1 % n2;
                break;
            case "^":
                result = Math.pow(n1 , n2);
                break;
            case "log":
                result = Math.log(n1);
                break;
            case "r":
                result = Math.sqrt(n1);
                break;
            default:
                System.out.println("You did not input a correct function");
                break; 
        }
        return result;
    }
}
