package Practice.Q13;

public class Arrival {
    private Flight myFlight;
    private String sta;  

    // Scheduled Time of Arrival ("hh:mm")  
    private int runway;
    private String gate;
    private int delay;
    private boolean landed;  
    public  Arrival(Flight myFlight, int sta) {  
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
        int temp = 
        String str = Integer.toString(temp);
        return str;
        // calculates the Estimated Time of Arrival (ETA) of the flight
        // by adding the delay to the sta and returning the result as a 
        // String ("hh:mm")  
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
