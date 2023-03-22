package topic05learningaids.stack;

import helpers.Keyboard;

public class PancakeMain {
    public static void main(String[] args){
        // instantiate a PancakeStack
        PancakeStack myBreakfast = new PancakeStack("Nutella");

        // ask the user how many pancakes they want, must be between 2 and 5
        System.out.println("Please enter the number of pancakes(must be between 2 and 5): ");
        int numberOfPancakes = Keyboard.readInt();
        if(numberOfPancakes < 2 || numberOfPancakes > 5){
            System.out.println("Please re-enter the number of pancakes(must be between 2 and 5): ");
            numberOfPancakes = Keyboard.readInt();
        }

        // loop between 0 up to not including number, and push
        for (int i = 0; i < numberOfPancakes; i++){
            myBreakfast.push();
        }

        // Confirm to user that pancake stack is ready to eat
        System.out.println("Your pancake stack is ready to eat!");

        char answer = 'y';
        do {
            // ask the user if they now want to eat the pancake
            System.out.println("Do you wish to eat a pancake? (y/n): ");
            answer = Keyboard.readChar();
            if(answer == 'y') {
                System.out.println("How many do you want to eat? ");
                Pancake eatMe = myBreakfast.pop();
            } else{
                System.out.println("Well the pancake is going to get cold...");
            }
    
        } while(answer == 'y' && !myBreakfast.isEmpty());

        System.out.println("Adios compadre, hasta la vista");
    }
}
