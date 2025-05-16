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
 */
import java.util.ArrayList;

public class Schedule {
    private ArrayList<Event> events;
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
        for (Event event : events) {
            if (event.getId() == id) {
                return event;
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
