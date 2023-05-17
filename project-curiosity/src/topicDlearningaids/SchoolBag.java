package topicDlearningaids;

public class SchoolBag {
    /*
     * ---------- Attributes ----------
     */
    String colour;
    String name;
    static String[] items = new String[] {"pencil", "pen", "book", "laptop", "pencil case"};
    static String[] bag = new String[]{};
    Boolean isBagfull = false;
    int baglimit = 10;
    static int bagamount = 0;

    public static void main(String[] args) {
        for (int i = 0; i < items.length; i++) {
            bag[i] = items[i];
            bagamount++;
        }
    }

    /*
     * ---------- Constructor ----------
    */

    /*
     * ---------- Behaviour ----------
     */
}
