package topic05learningaids;

import helpers.Keyboard;

public class PerfectSquareSequence {
    public static void main(String[] args) {
        System.out.println("*** Perfect Squares Sequence ***");
        System.out.println("**************************");

        //Entering a number for the sequence 
        System.out.println("Please enter a number between 0 and 41691");
        int SquareN = Keyboard.readInt();
        System.out.println("--------------------------------------");
    
        //Calculation of each number before and the number entered for the Squares
        if(SquareN <= 41691){
            for (int i = 1; i <= SquareN; i++) {
                System.out.print(square(i, 1) + ", ");
            }
        }
        System.out.println("");
    }

    public static int square(int n, int blocks){
        if (n == 1){
            return blocks;
        }
        return square(n-1, blocks) + ((2*n) - 1);
    }
}
