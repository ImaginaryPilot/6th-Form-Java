package fun;

import helpers.Keyboard;

public class CurrencyExchange {
    
    public static void main(String[] args){
        double amount;
        boolean exchanged = false;

        System.out.println("Enter amount: ");
        amount = Keyboard.readDouble();

        while (exchanged == false) {
            System.out.println("enter your currency: ");
            String currency = Keyboard.readString();
            
            if("pound".equals(currency)){
                double euro = amount * 1.14;
                System.out.println("Euro: " + euro);
                double dollar = amount * 1.19;
                System.out.println("Dollar: " + dollar);
                double yen = amount * 166.14;
                System.out.println("Yen: " + yen);
                double swissfranc = amount * 1.12;
                System.out.println("Swiss Franc: " + swissfranc);
                double rupee = amount * 96.69;
                System.out.println("Rupee: " + rupee);
                exchanged = true;
            }
            else if ("euro".equals(currency)){
                double pound = amount * 0.87;
                System.out.println("Pounds: " + pound);
                double dollar = amount * 1.04;
                System.out.println("Dollar: " + dollar);
                double yen = amount * 145.21;
                System.out.println("Yen: " + yen);
                double swissfranc = amount * 0.98;
                System.out.println("Swiss Franc: " + swissfranc);
                double rupee = amount * 83.92;
                System.out.println("Rupee: " + rupee);
                exchanged = true;
            }
            else if ("dollar".equals(currency)){ 
                double pound = amount * 0.85;
                System.out.println("Pound: " + pound);
                double euro = amount * 0.97;
                System.out.println("Euro: " + euro);
                double yen = amount * 140.78;
                System.out.println("Yen: " + yen);
                double swissfranc = amount * 0.96;
                System.out.println("Swiss Franc: " + swissfranc);
                double rupee = amount * 81.75;
                System.out.println("Rupee: " + rupee);
                exchanged = true;
            }
            else{
                System.out.println("Invalid currency");
                exchanged = false;
            }
        }
    }
}
