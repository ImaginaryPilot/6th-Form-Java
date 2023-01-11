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

    /*
     * ------- Coming Soon -------
     */

    /*
     * ------- Behavioural Methods -------
     * The functions an object can use to update the state.
     */

     public void damage() {
        health -= 1;
     }

     public void eat() {
        isHungry = false;
        hungerLevel = "Hamborgor";
     }
}
