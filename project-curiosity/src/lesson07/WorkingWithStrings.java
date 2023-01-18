package lesson07;

import helpers.Keyboard;

public class WorkingWithStrings {
    public static void main(String[] args){
        String myString = new String();
        boolean endWith = myString.endsWith("s");

        String paymentTypeCard = new String("Card");
        String paymentTypeCash = ("Cash"); // you will use this method the most

        // Ask for the payment type as input
        System.out.println("Enter your payment type (Cash/Card)");
        String userPaymentType = Keyboard.readString();

        // Compare userPaymentType with existing payment type
        if(userPaymentType.equals(paymentTypeCard)){ // we cannot use == because java will check for the memory location, not the state
            System.out.println("You are paying by Card");
        }

        if(userPaymentType.equals(paymentTypeCash)){
            System.out.println("You are paying by Cash");
        }
    }
}
