package Practice.May2018P2;

public class Visits {
    private String hotelCode;  //  id of the hotel 
    private int days;          //  number of days of the visit
    
    public Visits(String h, int d)  {    
        hotelCode = h;    
        days = d;  
    }  
    
    public int getDays()  {
        return days;  
    }
}
