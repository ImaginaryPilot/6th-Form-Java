package topicDlearningaids.HL;

public class AnimalCollectionDemo {
    public static void main(String[] args) {
        
        // target animal to search for
        Animal targetAnimal = new Animal("Persian Cat", "Persia", null, null, false);

        boolean isFound = false;

        // Instantiate the AnimalCollection
        AnimalCollection myAnimals = new AnimalCollection();

        // Reset to the head
        myAnimals.resetNext();

        // looping through my collections
        while (myAnimals.hasNext()){
            Animal nextAnimal = myAnimals.getNext();
            if(nextAnimal.name == targetAnimal.name){
                System.out.println("I hav found my Animal");
                isFound = true;
            }
        }

        if(isFound == false){
            System.out.println("I have not found my animal, I am so sorry");
        }
    }
}
