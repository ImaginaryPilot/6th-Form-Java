package topicDlearningaids.Simon;

public class HighJumpSheet {
    /*
     * ---------- Attributes ----------
     */
    // Static Members
    static final String[] ageGroups = {"U12", "U13", "U14", "U15"};

    Student[] participants; // students participating

    double[] results; // heights of the high jump

    /*
     * ---------- Constructor ----------
    */


    /*
     * ---------- Behaviour ----------
    */

    public void StoreResults(Student[] student, double[] results){
        // perform a linear search to the student in the array and get its position index

        // replace the value of the corresponding index in heights

        tallyResults();
    }

    public void tallyResults(){
        // perform a bubble sort on the results (and at the same time, the participants)
    }

    public Student calculateStudentWinner(){
        tallyResults();
        return participants[0];
    }

    public House calculateHouseWinner(){
        return null;
    }
}
