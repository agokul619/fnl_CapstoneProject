/**
 * Schedule.java
 * This class maintains the collection of all events and provides
 * methods to add, retrieve, and manipulate event data.
 * 
 * It serves as the central data store and implements methods for:
 * - Adding new events
 * - Retrieving events by ID
 * - Listing all events
 * - Managing the notification service
 * 
 */

//Author: Aditi Gokul
//Rev date: 5/18/25


import java.util.ArrayList;

public class Schedule 
{
	private ArrayList<Event> events; //event list 
	private NotificationService notificationService;

	public Schedule() 
	{
		events = new ArrayList<>();
		notificationService = new NotificationService();

	}

	public void addEvent(Event event) 
	{
		if (event != null) 
		{
			events.add(event);
		}
	}

	public boolean removeEvent(int id) 
	{
		for (int i = 0; i < events.size(); i++) 
		{
			if (events.get(i).getId() == id) 
			{
				events.remove(i);
				return true;
			}
		}
		return false;
	}

	public Event getEventById(int id) 
	{
		for(int eventID = 0; eventID < events.size(); eventID++) // iterating going through the array List
		{ 
			Event currentEvent = events.get(eventID); // grabbing the event in the list to compare its ID 
			if (currentEvent.getId() == id) // taking the current Event, getting it's position in the list (ID), comparing it to the for loop (ID)
			{ 
				return currentEvent; //return the event when a match, if not match, eventID ++ until it is.
			}
		}
		return null;
	}

	public ArrayList<Event> getAllEvents() 
	{
		return events;
	}

	public int getEventCount() 
	{
		return events.size();
	}

	public NotificationService getNotificationService() 
	{
		return notificationService;
	}
}
