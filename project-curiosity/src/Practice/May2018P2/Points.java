package Practice.May2018P2;

public class Points {
    private String memberId;  // id of the hotel customer
    
    private int totalPoints;  // this year's points 
    
    private int bonusPoints;  // any bonus points given to this year's new member 
    
    private String statusNow; // current(this year's)status
    
    private String statusNextYear; // following year's status 
    
    private static Visits[] allVisits = new Visits[366]; //details of each visit during the year
    
    int y = 9; // number of visits this year

    // constructor for new member
    public Points(String id)  {    
        memberId = id;    
        bonusPoints = 0;    
        y = 0;    
        statusNow  =  "Bronze";  
    }

    public Points(String id, int bp)  {    
        memberId = id;    
        bonusPoints = bp;    
        y = 0;    
        statusNow  =  "Bronze";  
    }

    // Accessor methods
    public String getMemberId() {
        return this.memberId;
    }

    // Mutator methods

    // Behaviour methods
    public boolean isGold() {
        boolean isGold = false;
        if(calculateTotalPoints(y, bonusPoints) >= 50000){
            return isGold = true;
        }
        return isGold;
    }

    public static int calculateTotalPoints(int days, int bonusPoints){
        int totalCurrentYear = 0;
        for(int i = 0; i < allVisits.length; i++){
            if(allVisits[i] != null){
                totalCurrentYear += allVisits[i].getDays() * 1000;
            }
        }
        return totalCurrentYear;
    }
}
