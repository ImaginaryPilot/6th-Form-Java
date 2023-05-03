package topicDlearningaids.HL;

public class Animal {
    
    /*
     * ---------- Attributes ----------
     */
    // This Animal...
    String name; // e.g. Dog, Koala, Axolotl

    String origin; // e.g. Australia, Africa, Brazil

    // My pointers...
    Animal next;

    Animal previous;
    

    /*
     * ---------- Constructor ----------
     */
    public Animal(String name, String origin, Animal next, Animal previous) {
        // node data
        this.name = name;
        this.origin = origin;
        // set pointers
        this.next = next;
        this.previous = previous;
    }


    /*
     * ---------- Behaviour ----------
     */
    public boolean hasNext(){
        if(this.next != null){
            return true;
        }
        return false;
    }
    
    public boolean hasPrevious(){
        if(this.previous != null){
            return true;
        }
        return false;
    }
    
    
    
}
