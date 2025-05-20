/**
 * Schedule.java
 * 
 * This class maintains the collection of all events and provides
 * methods to add, retrieve, and manipulate event data.
 * 
 * It serves as the central data store and implements methods for:
 * - Adding new events
 * - Retrieving events by ID
 * - Listing all events
 * - Managing the notification service
 * 
 * - 5/19 gabby notes: making clickable circles color coded based on priority 
 * - how to make the task disappear after?
 * - should it be a separate class? -> 'PriorityCircle.java'?
 * - 
 * - progress bar: automatic! should be .gif if worst comes to worst or moving GUI bar
 * - similar to .jar from previous assignment/test, but instead of 100% done ( w/ running program)
 * - progress bar can increase as the array list/ events are checked off
 * - checking off events! will be coded from above segment w/ clickable circles!
 * - required: mouseListener, another class: ProgressBar/TaskTracker?, 
 * 
 * 
 * 5/19 schoolnight update: NOT doing the above GUI creative anymore
 * will comment another class of just console output, no GUI even needed.. 
 * may add switch cases due to sheer amount of buttons/questions asked
 */
import java.util.ArrayList;

public class Schedule {
	private ArrayList<Event> events; //event list 
	private NotificationService notificationService;

	public Schedule() {
		events = new ArrayList<>();
		notificationService = new NotificationService();

	}

	public void addEvent(Event event) {
		if (event != null) {
			events.add(event);
		}
	}

	public boolean removeEvent(int id) {
		for (int i = 0; i < events.size(); i++) {
			if (events.get(i).getId() == id) {
				events.remove(i);
				return true;
			}
		}
		return false;
	}

	public Event getEventById(int id) {
		for(int eventID = 0; eventID < events.size(); eventID++) { // iterating going through the array List
			Event currentEvent = events.get(eventID); // grabbing the event in the list to compare its ID 
			if (currentEvent.getId() == id) { // taking the current Event, getting it's position in the list (ID), comparing it to the for loop (ID)
				return currentEvent; //return the event when a match, if not match, eventID ++ until it is.
			}
		}
		return null;
	}

	public ArrayList<Event> getAllEvents() {
		return events;
	}

	public int getEventCount() {
		return events.size();
	}

	public NotificationService getNotificationService() {
		return notificationService;
	}
}
