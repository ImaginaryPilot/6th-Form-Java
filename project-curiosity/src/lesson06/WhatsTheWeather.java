package lesson06;
import helpers.Keyboard;
import java.util.Random;

public class WhatsTheWeather {

    // Arrays
    static String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    static int[] temp = new int[7];
    static int[] humidity = new int[7];
    static String[] conditions = {"Sunny", "Cloudy", "Rain", "Snow", "Thunder"};

    public static void main(String[] args){
        // record all temperature data for each day of the week
        for (int i = 0; i <= 6; i++) {
            System.out.println("Weather of " + weekDays[i]);

            // enter a random temperature
            temp[i] = rand(-15, 50);
            System.out.println("Temperature: " + temp[i] + "C");

            // enter a random humidity
            humidity[i] = rand(0, 100);
            System.out.println("Humidity: " + humidity[i] + "%");

            // the condition of the weather
            switch(temp[i]){
                case 
            }
            if(temp[i] <= 25) {

            }
            System.out.println("--------------------------------------");
        }
    }

    public static int rand(int min, int max)
    {
        if (min > max) {
            throw new IllegalArgumentException("Invalid range");
        }
 
        double rand = Math.random();
        return (int)(rand * ((max - min) + 1)) + min;
    }
}
