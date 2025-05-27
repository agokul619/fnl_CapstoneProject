//Author: Gabby Moll
//Rev date: 5/20/25

public interface Notification 
{
	//Returns the notification message
	String getMessage();
	
	//Returns the event associated with this notification
	Event getEvent();		
}