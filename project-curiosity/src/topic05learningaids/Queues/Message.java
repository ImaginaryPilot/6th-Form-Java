package topic05learningaids.Queues;

public class Message {

    /*
     * --- Attributes ---
     */
    String title;

    String body;

    String contact;

    boolean isRead;

    public Message(String title, String body, String contact) {
        this.title = title;
        this.body = body;
        this.contact = contact;
    }

    /*
     * --- Behavior ---
     */

     public void read(){
        this.isRead = true;
     }
}
