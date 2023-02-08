package topicDlearningaids;

public class AmongUsFactory {

    public static AmongUs[] allCrew = new AmongUs[18];

    public static void main(String[] args) {
        // Example of using the "plain cookie cutter" constructor
        // What AmongUs colour do we get?
        AmongUs randomAstronaut = new AmongUs();
        System.out.println("");
    }

    public static void createAmongUsEveryColor(){
        // Create an instances of the AmongUs in every colour
        for(int c = 0; c < AmongUs.WARDROBE.length; c++) {
            // create an instance of AmongUs in a color
            String role = AmongUs.ROLES[(c % 7)];
            AmongUs astro = new AmongUs(AmongUs.WARDROBE[c], role);
            // We store the AmongUs
            allCrew[c] = astro;
        }
    }
}