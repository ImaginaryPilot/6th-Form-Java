package lesson08.Dmitrii;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Appointment {
    
    // ----- Attributes -----
    int appointmentID;

    String title;

    String type;

    LocalDateTime date;

    Location location;

    Description description;

    Calender calender;

    ArrayList<Guest> guests;

    ArrayList<Notification> notifcation;
}
