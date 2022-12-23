package lesson05;

import helpers.Keyboard;
import java.util.concurrent.TimeUnit;

public class MathPalChallengeTeamA {
    public static void main(String[] args) {
        int result = 0;
        System.out.println("Are you ready to do some math? (y/n):");
        char isReady = 'y';
        isReady = Keyboard.readChar();        

        while(isReady == 'y') {
            
            System.out.println("1. Counting");
            System.out.println("2. Add");
            System.out.println("3. Subtract");
            System.out.println("4. Multiply");
            System.out.println("5. Divide");

            System.out.println("What to you want to try?");
            int function = Keyboard.readInt();

            System.out.println("Enter two numbers");
            int n1 = Keyboard.readInt(); 
            int n2 = Keyboard.readInt();
            System.out.println("--------------------------------------");

            System.out.println("calculating function...");
            for(int i = 0; i <3; i++) {
                System.out.print(".");
                pause(1);
            }

            System.out.println(" ");
            int output = operationFunction(function, n1, n2, result);
            System.out.println(output); 
            System.out.println("--------------------------------------");

            System.out.println("Do you want an explainer? (true/false)");
            boolean expl = Keyboard.readBoolean();

            // TODO: This requires a bit more planning
            // Why not have separate functions for explainers to keep it clean?
            // or perhaps make use of operationFunction to include the explainer.
            if (expl == true) {
                explainer(function, n1, n2, result);
            }

            System.out.println("Wanna have another go? (y/n)");
            isReady = Keyboard.readChar();
        }

        System.out.println("Bye bye then. See you next time.");
    }

    public static int operationFunction(int function, int n1, int n2, int result) {
        switch (function){
            case 1:
                while (n1 <= n2){
                    result = n1++;
                    if(result != n2){
                        System.out.println(result);
                    }
                }
                break;
            case 2:
                result = n1+n2;
                break;
            case 3:
                result = n1-n2;
                break;
            case 4:
                result = n1*n2;
                break;
            case 5:
                result = n1/n2;
                break;
            default:
                System.out.println("You did not input a correct function");
                break; 
        }
        return result;
    }

    public static void explainer(int function, int n1, int n2, int result){
        switch (function){
            case 1:
                System.out.println("You have a number and you add 1 everytime you count.");
                System.out.println("Example: 1 + 1 = 2, then 2 + 1 = 3 and so on...");
                System.out.println("Result is 1, 2, 3, 4...");
                break;
            case 2:
                System.out.println("You put 2 numbers together and make a bigger number.");
                result = n1+n2;
                System.out.println("Example: " + n1 + " + " + n2 + " = " + result);
                break;
            case 3:
                System.out.println("You remove one number from another.");
                result = n1-n2;
                System.out.println("Example: " + n1 + " - " + n2 + " = " + result);
                break;
            case 4:
                System.out.println("You add the same number together multiple of times.");
                result = n1*n2;
                System.out.println("Example: " + n1 + " * " + n2 + " = " + result);
                break;
            case 5:
                System.out.println("You seperate a number into smaller equal numbers.");  
                result = n1/n2;
                System.out.println("Example: " + n1 + " / " + n2 + " = " + result);
                break;
            default:
                System.out.println("You did not input a correct function");
                break; 
        }
    }

    private static void pause(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
        }
    }
}
