package lesson04;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import helpers.Keyboard;

/**
 * Can you read your teacher's code?
 * Run the code, experiment with input, and fill in the // with your explainers.
 * Filling in the comments is not optional so do not ask whether you can not do it *eye roll*.
 */
public class AlexaSkillGuessTheNumber {
    public static void main(String[] args) {
        //Introduction
        System.out.println("Hello there, let's play: Guess The Number.");
        System.out.println("Are you ready?");
        String response = Keyboard.readString();

        //Response on wheher user wants to play
        if (response.equals("yes") || response.equals("y")) {
            System.out.println("Hmm... all right let me think of a number...");

            //Ai picks a number from ) to 10
            int number = (new Random()).nextInt(10);
            
            //Waiting for the Ai to "process and think"
            System.out.print(".");
            pause(1);
            System.out.print(".");
            pause(1);
            System.out.print(".");
            pause(1);
            System.out.println("");

            //number of tries is provided and start playing
            int triesLeft = 4;
            System.out.println("Ok. You have 4 tries left. Have a go at your first guess.");
            int guess = Keyboard.readInt();
            
            //if the user does not guess the number and there are more than 0 tries left, print the statements, else print the else statement
            while (guess != number && triesLeft > 0) {
                if (guess < number) { //
                    System.out.println("You are not correct! The number I am thinking of, is larger. Take another guess...");
                } else { // 
                    System.out.println("You are not correct! The number I am thinking of, is smaller. Take another guess...");
                }
                //The user is given another guess and tries are reduced
                guess = Keyboard.readInt();
                triesLeft = triesLeft - 1;
            }
               
            //In the case that the user guessed the number whilst the number of tries left is greater than 0 print the if statement
            if (triesLeft > 0 && guess == number) { //
                System.out.println("Well done, you guessed. That was a good round.");
            } else { //the user has lost
                System.out.println("You lost! The number I thought of was: " + number);
                System.out.println("Better luck next time.");
            }

        } else { //The user does not want to play
            System.out.println("That is all right. Maybe some other time...");
            System.out.println("Have a great day!");
        }
    }

    //This function is to stop the main class from functioning further, but rather wait for the Ai to "think"
    //
    //
    private static void pause(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
        }
    }
}