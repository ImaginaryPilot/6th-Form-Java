package lesson13.mcdexample;

public class MainMeal extends FoodItem {
    
    final double PRICE_MARKUP = 1.26;

    Sandwich sandwich;

    @Override
    public double getPrice() {
        return super.price * PRICE_MARKUP;
    }
}
