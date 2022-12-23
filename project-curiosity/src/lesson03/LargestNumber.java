package lesson03;

import helpers.Keyboard;
/**
 * Write a program that accepts three numbers as input from the user
 * and outputs the largest one.
 */
public class LargestNumber {
    public static void main(String[] args) {
        // Plan out the algorithm by writing steps in english...
        /*
         * Get the integers from user inputs
         * Find the largest number by comapring them to the rest
         * Calculate
         * Print the largest number
         */
        int n1,n2,n3;
        int bn = 0;

        System.out.println("Please enter three numbers: ");
        n1 = Keyboard.readInt();
        n2 = Keyboard.readInt();
        n3 = Keyboard.readInt();

        
        if(n1 > n2 && n1 > n3){
            bn = n1;
        }
        else if(n2 > n1 && n2 > n3){
            bn = n2;
        }
        else if(n3 > n2 && n3 > n2){
            bn = n3;
        }
        else {
            bn = n1;
        }
        System.out.println("The biggest number is: " + bn);
    }
}