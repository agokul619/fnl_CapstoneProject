/**
 * Meeting.java
 * Represents scheduled meetings in the system
 * This class extends the Event class to include meeting-specific
 * information such as location and attendees.
 */

//Authors: Aditi Gokul, Gabby Moll
//Rev date: 5/18/25

import java.util.ArrayList;

public class Meeting extends Event 
{

    private String location;
    private ArrayList<String> attendees;

    public Meeting(String title, String description, String location, NotificationService notificationService) 
    {
        super(title, description, notificationService);
        this.location = location;
        this.attendees = new ArrayList<>();
    }

    public String getLocation() 
    {
        return location;
    }

    public void setLocation(String location) 
    {
        this.location = location;
    }

    public void addAttendee(String name) 
    {
        attendees.add(name);
    }

    public String getAttendeeList() 
    {
        if (attendees.isEmpty()) 
        {
            return "None";
        }

        String result = "";
        for (int i = 0; i < attendees.size(); i++) 
        {
            result += attendees.get(i);
            if (i < attendees.size() - 1) 
            {
                result += ", ";
            }
        }

        return result;
    }

    @Override

    public String getType() 
    {
    	return "Meeting";
    }

}