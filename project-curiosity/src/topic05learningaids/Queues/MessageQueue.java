package topic05learningaids.Queues;
/*
 * Message Queue is a Thread so that it can run in parallel
 * to the Main Java Thread
 */

public class MessageQueue extends Thread {

    Message[] queue;

    final int Head_Index = 0;
    int tailIndex;

    /*
     * constructor
     */
    public MessageQueue() {
        queue = new Message[5];
        tailIndex = Head_Index;
    }
    
    /*
     * A method for the Thread
     */
    public void run() {
        // dequeue the message
        // if message then... process the message(read)
        // else... no
        // wait a bit
        // go back to step 1 indefinetly
    } 

    public void enqueue(Message message) {
        if(!isFull()){
            queue[tailIndex] = message;
            tailIndex++;
        }
    }

    public Message dequeue(){
        //check not empty because if empty then cannot dequeue
        if(!isEmpty()){
            Message m = queue[Head_Index]; // get message at the head
            //shift all elements by 1
            for(int i = Head_Index + 1; i <= tailIndex - 1; i++){
                Message shift = queue[i];
                queue[i - 1] = shift;
                queue[i] = null;
            }
            tailIndex--;
            return m;
        }
        return null;
    }

    public boolean isEmpty() {
        return tailIndex == Head_Index;
    }

    public boolean isFull() {
        return tailIndex == queue.length;
    }
}
