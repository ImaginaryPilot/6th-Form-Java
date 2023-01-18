package topic05learningaids;

public class WhatsTheWeather2 {
    public static void main(String[] args){
        // declare all of the arrays we need
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // declare all 2D arrays. (row first, then columns)
        float[][] temperatures = new float [7][24];
        int[][] humidity = new int [7][24];
        int[][] conditions = new int [7][24];

        // Practice inserting data for a particular day and hour...
        // right now it is Wednesday 9:11
        // Index of our row is 2
        // Index of our column is 9:00 and 10:00
        temperatures[2][10] = 10.07f; // According to google right now :D
    }
}