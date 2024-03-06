package topicDlearningaids.TransportCard;

import helpers.ArrayHelper;
import helpers.Keyboard;

public class TransportCardFactory {
    public static void main(String[] args) {
        Stop stop;

        Passenger john = new Passenger("john", 25, "283742A");
        Card myCard = new Card(john);
        Route route = new Route("randomRoute", "1");

        for (int i = 0; i < 15; i++) {
            stop = new Stop(i);
            route.addStop(i, stop);
        }

        myCard.premiumTopUp(20);
        System.out.println("Your current balance: " + myCard.getBalance());

        System.out.println("How many stops will you go through?");
        int userChoice = Keyboard.readInt();
        double amount = userChoice * Stop.getFair();

        if (amount > myCard.getBalance() || amount < 0) {
            System.out.println("invalid");
        } else {
            System.out.println("accepted");
            myCard.useCard(amount);
            System.out.println("Your new balance: " + myCard.getBalance());
        }
    }
}
