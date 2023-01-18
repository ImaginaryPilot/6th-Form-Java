package lesson07;

public class Soldier {
    
    /*
     * ------- Attributes -------
     * These are all the properties that describe the state.
     */
    int health;
    String name;
    int ID;
    String hungerLevel = "Borgor";
    boolean isHungry; 
    char gender;

    /*
     * ------- Coming Soon -------
     */

    public Soldier(){} // default constructor
    public Soldier(char gender){ // paramitised constructor to immediately get a desired state
        this.gender = gender;   
    }

    /*
     * ------- Behavioural Methods -------
     * The functions an object can use to update the state.
     */

     public void damage() {
        health -= 1;
     }

     public void eat() {
        if(isHungry) {
            switch(hungerLevel) {
                case "Hamborgor":
                case "Borgor":
                default:
            }
        }
        isHungry = false;
     }
}
