package topicDlearningaids.CrashCourse;

/* 1.
 * Class is defined as the bludeprint of an abstract entity. 
 * It defines the state and behaviour of the gven entity.
 */
/*
 * 3. 
 * Primitive is defined as the fundamental variables embedded into the programming paradigm. 
 * E.g. int, boolean, etc, uphold basic functions with no beheviour.
 */
/*
 * 4.
 * An instance is a tangible version of the class utilising memory, with state unique to it and behaviour changing its state. 
 * A method to instantiate is using the 'new' keyword and the constructor.
 */
public class Card {
    // state

    // 2. An identifier is a unique label/name given to a particular object. 
    double balance = 0;
    int id;

    // behaviour
    /*
     * 5. 
     * A parameter is unique variable specific to the method. 
     * Used to accept input elements to alter the state of the object.
    */
    public double TopUp(double addAmount) {
        return this.balance += addAmount;
    }
}
