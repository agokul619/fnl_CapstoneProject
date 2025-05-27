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
	//fields

    private String location;
    private ArrayList<String> attendees;

    //constructor
    
    public Meeting(String title, String description, String location, NotificationService notificationService) 
    {
        super(title, description, notificationService);
        this.location = location;
        this.attendees = new ArrayList<>();
    }
    
    //getters and setters
    
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

    //Returns a comma-separated string listing all attendees.
    //Returns "None" if there are no attendees.
    
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