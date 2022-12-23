package lesson05;

public class CleanHouse {
    public static void main(String[] args) {
        
    }
    //------------------Method of cleaning------------------------
    public static void sweepTheFloor(String broom) {
        System.out.println("I am sweeping the floor with:  " + broom);
    }

    public static void mopTheFloor(String mop) {
        System.out.println("I am mopping the floor with:  " + mop);
    }

    public static void declutter() {
        System.out.println("I am decluttering with my hands.");
    }

    public static void rearrange() {
        System.out.println("I am rearranging with my hands.");
    }

    //----------------------Where to clean------------------------
    public static void cleanTerrace(String[] supplies) {
        sweepTheFloor("Outside Broom");
        mopTheFloor("Outside Mop");
    }

    public static void cleanOffice(String[] supplies) {
        declutter();
        sweepTheFloor("Inside Broom");
        mopTheFloor("Inside Mop");
        rearrange();
    }

    public static void cleanBedroom(String[] supplies) {
        declutter();
        sweepTheFloor("Inside Broom"); 
        mopTheFloor("Inside Mop");
        rearrange();
    }

    public static void cleanBathroom(String[] supplies) {
        declutter();
        sweepTheFloor("Inside Broom");
        mopTheFloor("Inside Mop");
        rearrange();
    }
}
