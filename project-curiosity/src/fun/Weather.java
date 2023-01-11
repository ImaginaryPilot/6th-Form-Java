package fun;

public class Weather {
    
    // let us agree on a number chart
    float temp = 0.0f;
    int humidity = 0;

    // Arrays
    static char[] date = {'T', 'D', 'M', 'Y'};
    static char[] weekDays = {'M', 'T', 'W', 'T', 'F', 'S', 'S'};

    public static void main(String[] args){
        System.out.println("The weather on " + date[0]);
    }
}
