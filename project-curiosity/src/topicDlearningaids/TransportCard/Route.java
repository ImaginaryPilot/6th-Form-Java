package topicDlearningaids.TransportCard;

import java.util.ArrayList;

public class Route {

    public ArrayList<Stop> allStops = new ArrayList<Stop>();

    private String routeNumber;
    private String routeName;

    public Route(String name, String routeNumber) {
        this.routeNumber = routeNumber;
        this.routeName = name;
    }

    public void addStop(int index, Stop stop) {
        allStops.add(index, stop);
    }

    public void printStops() {
        System.out.println(allStops);
    }
}
