package topicDlearningaids.HL;

public class AnimalCollection {
    
    /*--------Attributes--------- */
    Animal headAnimal;

    Animal currentAnimal;

    /*--------Constructor--------- */
    public AnimalCollection(Animal animal){
        this.headAnimal = animal;
        this.currentAnimal = animal;
    }

    /*--------Behaviour--------- */
    // As contracted in the IB Collection
    public void resetNext(){

    }

    public Animal getNext(){
        return null;
    }

    public boolean hasNext(){
        return false;
    }

    public void addItem(Animal item){

    }

    public void removeItem(Animal item){

    }

    // nice perks we want to add for developer, in exams these require
    public Animal getHead(){
        return this.headAnimal;
    }

    /**
     * It gets the last item in the Animal Collection
     * @return
     */
    public Animal getTail(){
        return null;
    }

    public boolean isEmpty(){
        if(headAnimal == null){
            return true;
        }
        return false;
    }

}
