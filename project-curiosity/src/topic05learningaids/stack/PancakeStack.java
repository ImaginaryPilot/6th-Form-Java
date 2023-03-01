package topic05learningaids.stack;

import java.util.Stack;

public class PancakeStack {
    /**
     * Atrributes (State)
     */

    int size; // this is a stack attribute

    Pancake[] stack = new Pancake[5];

    String topping; // this is a pancake attribute

    public PancakeStack(String topping){
        this.topping = topping;

    }

    /** 
     * Method (Behavior)
     */
    public void push(){
        if (isFull()) return;
        // create the pancake
        Pancake p = new Pancake();
        int pos = stack.length - size;
        stack[pos]= p;
        size++;
    }

    public Pancake pop(){
        if(isEmpty()) return null;
        // remove a pancake from the stack
        int pos = stack.length - size;
        Pancake p = stack[pos];
        stack[pos] = null;
        size--;
        return p;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == stack.length;
    }
}
