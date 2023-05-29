package Practice;

public class CalculateBMI {
    // variables
    static String[] Name = {"Annie", "Boris", "Hugh", "Paul", "Robby", "Zara"};
    static double[] Weight = {52.4, 100, 105, 61, 88, 68};
    static double[] Height = {1.56, 2, 2.03, 1.75, 1.8, 1.71};

    public static double CalcBMI(double Weight, double Height) {
        double temp = Height * Height;
        double BMI = Weight/temp;
        return BMI;
    }

    public static double AverageBMI() {
        double sum = 0;
        for (int i = 0; i < Name.length; i++) {
            double temp = CalcBMI(Weight[i], Height[i]);
            sum += temp;
        }
        return sum / Name.length;
    }

    public static void main(String[] args) {
        for (int i = 0; i < Name.length; i++) {
            double temp = CalcBMI(Weight[i], Height[i]);
            if(temp > AverageBMI()){
                System.out.println(Name[i] + ", "+ temp);
            }
        }
    }
}
