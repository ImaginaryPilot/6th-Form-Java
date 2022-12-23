package lesson03;

import helpers.Keyboard;

public class ClassWhoisWho {
    public static void main(String[] args){
        System.out.println("Welcome to our game of Who is who, Year 12 Edition.");
        System.out.println("This program is a decision tree of the classroom. You can identify any member by aasking questions about themselves.");

        boolean hasfeature;

        //The first feature is about height
        System.out.println("Is the person you are looking for extremely tall? (true/false)");
        hasfeature = Keyboard.readBoolean();
        if(hasfeature){
            System.out.println("You are looking for Fried M");
        }
        else {
            System.out.println("Are you looking for a female?");
            hasfeature = Keyboard.readBoolean();
            if(hasfeature){
                System.out.println("Does she have black plain hair with glasses?");
                hasfeature = Keyboard.readBoolean();
                if(hasfeature){
                    System.out.println("Oh, you are looking for Ms C");
                }
                else{
                    System.out.println("Caitlin is your girl, she is very cool.");
                }
            }
            else {
                System.out.println("Does the person you are looking for have a scarf?");
                hasfeature = Keyboard.readBoolean();
                if(hasfeature){
                    System.out.println("You are looking for Dmitrii");
                }
                else{
                    System.out.println("Is the hair parted exactly in the middle?");
                    hasfeature = Keyboard.readBoolean();
                    if(hasfeature){
                        System.out.println("Then it is Fried T");
                    }
                    else{
                        System.out.println("Is he laughing at Fried T");
                        hasfeature = Keyboard.readBoolean();
                        if(hasfeature){
                            System.out.println("Then it is his best buddy Simon");
                        }
                        else{
                            System.out.println("Does he have blond hair?");
                            hasfeature = Keyboard.readBoolean();
                            if(hasfeature){
                                System.out.println("Then it's Joshua");
                            }
                            else{
                                System.out.println("Does he have brown hair?");
                                hasfeature = Keyboard.readBoolean();
                                if(hasfeature){
                                    System.out.println("Then it is Benedek");
                                }
                                else {
                                    System.out.println("Then it is Kailu");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
