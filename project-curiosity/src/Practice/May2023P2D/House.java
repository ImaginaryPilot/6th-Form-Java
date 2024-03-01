package Practice.May2023P2D;

public class House {
    private int price;

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int prices) {
        this.price = prices;
    }

    public House(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        String temp = "" + this.price;
        return temp;
    }
}
