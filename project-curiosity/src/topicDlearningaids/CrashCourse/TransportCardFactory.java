package topicDlearningaids.CrashCourse;

public class TransportCardFactory {
    public static void main(String[] args){
        Card myCard = new Card();
        myCard.premiumTopUp(20);
        System.out.println(myCard.balance);
        myCard.useCard(2.5);
        System.out.println(myCard.balance);
    }
}
