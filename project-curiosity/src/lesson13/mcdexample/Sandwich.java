package lesson13.mcdexample;

public class Sandwich extends FoodItem{

    private static final double premium = 7.25;
    private static final double standard = 6.25;
    private final String NO_TOMATOES = "NT";

    String[] grillOrder = new String[3];

    boolean isPremium;

    public Sandwich(String code, boolean isLimitedEdition) {
        super(code, standard);

        if(isPremium) {
            super.setPrice(premium);
        }
    }


    public void printKitchenOrder(){
        String order = this.code + ": ";
        
        for (int i = 0; i < grillOrder.length; i++){
            if(grillOrder[i] == null) return;

            order += grillOrder[i] + ", ";
        }
    }
}
