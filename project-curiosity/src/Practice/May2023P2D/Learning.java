package Practice.May2023P2D;

public class Learning {

    House[] allHouses = new House[10];

    public static void main(String[] args) {

    }

    public void unknown(String x) {
        for (int i = 0; i < allHouses.length; i++) {
            if (allHouses[i].getCity().equals(x)) {
                println(allHouses[i].getAddress());
            }
        }
    }

    public House getCity() {
        return null;
    }

    public House getAddress() {
        return null;
    }
}
