/**
 * Event.java
 * Abstract base class for different event types
 * This class defines the common properties and behaviors for all
 * event types in the application. It includes methods for:
 * - Basic event information (title, description)
 * - Completion status
 * - Unique ID generation
 * - Notification handling
 */

//Author: Aditi Gokul

public abstract class Event {

    // Static field to generate unique IDs
	
    private static int nextId = 1;
    
    //fields
    
    private int id;
    private String title;
    private String description;
    private boolean completed;
    private NotificationService notificationService;

    public Event(String title, String description, NotificationService notificationService) 
    {
        this.id = nextId++;
        this.title = title;
        this.description = description;
        this.completed = false;
        this.notificationService = notificationService;
    }
    
    //getters and setters

    public int getId() 
    {
        return id;
    }

    public String getTitle() 
    {
        return title;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getDescription() 
    {
        return description;
    }

    public void setDescription(String description) 
    {
        this.description = description;
    }
    
    //Checks if the event is marked as completed.

    
    public boolean isCompleted() 
    {
        return completed;
    }
    
    //Marks the event as completed or not.
    //Sends a notification if marked completed.

    public void setCompleted(boolean completed) 
    {
        this.completed = completed;
        if (completed) 
        {
            notify("Event '" + title + "' marked as completed!");
        }
    }
    
    //Sends a notification message using the notification service.

    protected void notify(String message) 
    {
        if (notificationService != null) 
        {
            notificationService.sendNotification(new BasicNotification(message, this));
        }
    }
    
    public abstract String getType();

}