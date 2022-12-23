package lesson03;

import helpers.Keyboard;

public class Selection {
    public static void main(String[] args) {
        // Declare a variable to store the age
        int age;

        System.out.println("Please enter an age between 5 and 100 inclusive: ");
        age = Keyboard.readInt();

        // Milestone activities to show you reached a certain age
        if (age >= 95){
            System.out.println("why are you still here? Please go back and try again");
        }
        else if (age >= 60){
            System.out.println("Enjoy your golden years!");
        }
        else if (age >= 35){
            System.out.println("How is your mid life crisis?");
        }
        else if (age >=21){
            System.out.println("You should drop out and give up now.");
        }
        else if(age >= 16){
            System.out.println("Don't be an edgelord.");
        }
        else {
            System.out.println("Your gonna experience hell in the future");
        }
    }
}
