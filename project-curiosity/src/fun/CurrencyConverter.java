package fun;

import helpers.Keyboard;

public class CurrencyConverter {
    public static void main(String[] args){
        double amount, newamount;
        boolean exchanged = false;

        System.out.println("Enter amount: ");
        amount = Keyboard.readDouble();

        while (exchanged == false) {
            System.out.println("pick which currency you want to convert to, euro or pound? ");
            String currency = Keyboard.readString();
            
            if("pound".equals(currency)){
                newamount = amount * 1.14;
                System.out.println("The new amount is: " + newamount + " euros");
                exchanged = true;
            }
            else if ("euro".equals(currency)){
                newamount = amount * 0.88;
                System.out.println("The new amount is: " + newamount + " pounds");
                exchanged = true;
            }
            else{
                System.out.println("Invalid currency");
                exchanged = false;
            }
        }
    }
}
