package Practice.May2023P2D;

public class Learning {

    static House[] allHouses = new House[10];

    public static void main(String[] args) {
        for (int i = 0; i < allHouses.length; i++) {
            House house = new House(i);
            allHouses[i] = house;
        }

        System.out.println(houseSort(allHouses));

    }

    public static House[] houseSort(House[] house) {

        int i = 1;
        while (i < house.length) {
            int j = 0;
            while (j <= (house.length - 2)) {

                if (house[j].getPrice() > house[j + 1].getPrice()) {
                    House temp = house[j + 1];
                    house[j + 1] = house[j];
                    house[j] = temp;
                }
                j++;
            }
            i++;
        }

        return house;
    }

    public static House[] selectThree(int budget) {
        House[] expensiveHouses = new House[3];

        houseSort(allHouses);

        for (int i = allHouses.length; i > 0; i--) {
            if (allHouses[i].getPrice() > budget) {
                break;
            }

            if (expensiveHouses[2] == null) {
                expensiveHouses[2] = allHouses[i];
                break;
            }
            if (expensiveHouses[1] == null) {
                expensiveHouses[1] = allHouses[i];
                break;
            }
            if (expensiveHouses[0] == null) {
                expensiveHouses[0] = allHouses[i];
                break;
            }
        }

        return expensiveHouses;
    }
}
