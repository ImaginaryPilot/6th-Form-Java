package lesson13.mcdexample;

public class FoodItem {
    
    protected static String code; //"CHB"

    protected static double price;

    public FoodItem(String code, double price) {

    }

    // Method 

    /* Accessor */
    protected void setPrice(double price) {
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }
}
