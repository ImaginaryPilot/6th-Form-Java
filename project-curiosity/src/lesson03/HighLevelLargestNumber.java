package lesson03;

public class HighLevelLargestNumber {
    public static void main(String[] args){
         // Data Srructure  of numbers (int)
        int[] numbers = new int[5]; //array
        numbers[0] = 17;
        numbers[1] = 23;
        numbers[2] = 64;
        numbers[3] = 69;
        numbers[4] = 420;

        //Declare a variable to store the largest number
        int largest = numbers[0];   

        //loop while I still have numbers to go through
        int myMemoryPointer = 0;
        while(myMemoryPointer < 4){
            int compare = numbers[(myMemoryPointer + 1)];
            largest = larger(largest , compare);
            myMemoryPointer++;
        }

        System.out.println("The largest number is " + largest);
    }

    // public static output_type nameOfPredefinedProcess (input variables)
    public static int larger(int n1, int n2){
        if(n1 > n2){
            return n1;
        }
        else {
            return n2;
        }
    }
}
