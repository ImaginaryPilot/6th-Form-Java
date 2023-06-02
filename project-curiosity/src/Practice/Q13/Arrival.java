package Practice.Q13;


public class Arrival {
    private Flight myFlight;
    private String sta;  

    // Scheduled Time of Arrival ("hh:mm")  
    private int runway;
    private String gate;
    private int delay;
    private boolean landed;  
    public  Arrival(Flight myFlight, String sta) {  
        this.myFlight = myFlight; 
        this.sta = sta;
        this.runway = 0;
        this.gate = null;
        this.delay = 0;
        this.landed = false;  
    }  
    public void addDelay(int newDelay) {  
        this.delay = newDelay;  
    }
    
    public String getETA() { 
        // assume code is there
        return "01:10"; // todo: obviously this is just an example
    }
    
    public int compareWith(String flightID) {  
        if (myFlight.getID().equals(flightID)) { 
            return 0; 
        }
        else { 
            return 1; 
        }  
    }
    public int compareWith(Arrival anotherArrival) {    
        return (this.getETA().compareTo(anotherArrival.getETA()));
    }    
    
    // ... plus accessor and mutator methods
}
