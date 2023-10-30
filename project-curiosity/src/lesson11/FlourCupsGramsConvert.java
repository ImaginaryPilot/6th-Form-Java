package lesson11;

public class FlourCupsGramsConvert {
    
    // Attributes
    private final double GramsPerCup = 120;

    private int numberOfCups;

    // Cnstructor
    public FlourCupsGramsConvert(int numberOfCups) {
        this.numberOfCups = numberOfCups;
    }

    // Methods
    public double getNumberOfCups() {
        return this.numberOfCups;
    }

    public double getGrams() {
        return numberOfCups * GramsPerCup;
    }
}