package topicDlearningaids.CrashCourse;

public class TransportCardFactory {
    public static void main(String[] args){
        Stop stop;
        
        Passenger john = new Passenger("john", 25, "283742A");
        Card myCard = new Card(john);
        Route route = new Route("randomRoute", "1");

        for(int i = 0; i < 5; i++){
            route.allStops.addStop(i, stop);
        }

        myCard.premiumTopUp(20);
        myCard.useCard(2.5);
        System.out.println(myCard.getPassenger().getName());


    }
}
