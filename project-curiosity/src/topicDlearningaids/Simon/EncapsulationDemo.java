package topicDlearningaids.Simon;

import java.util.Date;

/*
 * This is just a class with the main() to explain what "information hiding" truly means
 */
public class EncapsulationDemo {
    public static void main(String[] args) {
        // todo: Create an instance of a student

        Student student = new Student(new Date(2022, 8, 22),"Benedek","Szesztai");
    }
}
