package topicDlearningaids.Simon;

import java.util.Date;

// Encapsulation: Public, Protected, Private
public class Student {
    /*
     * ---------- Attributes ----------
     */
    private String name;

    private String surname;

    private Date dob;

    private int year;
    

    /*
     * ---------- Constructor ----------
    */
    public Student(Date dob, String name, String surname) {
        this.name = name;
        this.dob = dob;
        this.surname = surname;
    }

    /*
     * ---------- Behaviour ----------
    */
}
