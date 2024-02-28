package topicDlearningaids.CrashCourse;

public class Stop {
    private int stopNumber;
    private static double fair = 0.5;

    public Stop(int stopNumber){
        this.stopNumber = stopNumber;
    }
    
    public int getStopNumber(){
        return this.stopNumber;
    }

    public static double getFair() {
        return Stop.fair;
    }
}
