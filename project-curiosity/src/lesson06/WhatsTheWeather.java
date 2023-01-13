package lesson06;
import helpers.Keyboard;
import java.util.Random;

public class WhatsTheWeather {

    // Arrays
    static String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    static int[] humidity = new int[7];
    static String[] conditions = {"Sunny", "Cloudy", "Rain", "Snow", "Thunder", "Windy"};

    // Random Factor
    static Random ran = new Random();
    static int temperature = 0;

    public static void main(String[] args){
        // enter a random temperature
        temperature = rand(-25, 50);
        // record all temperature data for each day of the week
        for (int i = 0; i <= 6; i++) {
            System.out.println("Weather of " + weekDays[i]);
            

            // enter a random humidity
            humidity[i] = rand(0, 100);
            System.out.println("Humidity: " + humidity[i] + "%");

            // the condition of the weather
            System.out.println("Weather condition: " + conditions[ran.nextInt(conditions.length)]);
            System.out.println("--------------------------------------");
        }

        System.out.println("This is the weather condition for this week.");
    }

    public static int rand(int min, int max)
    {
        if (min > max) {
            throw new IllegalArgumentException("Invalid range");
        }
 
        double rand = Math.random();
        return (int)(rand * ((max - min) + 1)) + min;
    }

    public static int a(int a){
        return a;
    }
}
