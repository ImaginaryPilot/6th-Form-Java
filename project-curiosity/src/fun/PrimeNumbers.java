package fun;

import helpers.Keyboard;

public class PrimeNumbers {
    public static void main(String[] args){
        //Input number (smallest and largest)
        int sn, bn;

        System.out.println("Please enter the smallest number: ");
        sn = Keyboard.readInt();
        System.out.println("Please enter the largest number: ");
        bn = Keyboard.readInt();
        
        //check each number 
        while (sn <= bn){
            if (sn <= 1) {}
            else if(sn % 2 == 0 && sn != 2){}  
            else if(sn % 3 ==0 && sn != 3){}
            else if(sn % 5 == 0 && sn != 5){}
            else if(sn % 7 == 0 && sn != 7){}
            else{
                System.out.println(sn + " is a prime number");
            }            
            sn++;
        }
        System.out.println("Done!");
    }
}
