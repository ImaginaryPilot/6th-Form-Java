package topicDlearningaids.CrashCourse;

public class Passenger {
    private String name = "";
    private int age;
    private String idNumber;

    public Passenger(String name, int age, String idNumber) {
        this.name = name;
        this.age = age;
        this.idNumber = idNumber;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
