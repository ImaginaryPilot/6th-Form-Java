package Practice;

public class CalculateBMI {
    // variables
    static String[] Name = {"Annie", "Boris", "Hugh", "Paul", "Robby", "Zara", "Benedek", "Kailu"};
    static double[] Weight = {52.4, 83, 86, 61, 78, 68, 64, 59};
    static double[] Height = {1.56, 1.88, 1.92, 1.75, 1.8, 1.71, 1.75, 1.73};

    public static double CalcBMI(double Weight, double Height) {
        double temp = Height * Height;
        double BMI = Weight/temp;
        BMI = Math.round(BMI);
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
