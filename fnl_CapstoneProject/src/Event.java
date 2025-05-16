/**

 * Event.java

 * Abstract base class for different event types

 * 

 * This class defines the common properties and behaviors for all

 * event types in the application. It includes methods for:

 * - Basic event information (title, description)

 * - Completion status

 * - Unique ID generation

 * - Notification handling

 */

public abstract class Event {

    private static int nextId = 1;

    private int id;

    private String title;

    private String description;

    private boolean completed;

    private NotificationService notificationService;

    

    public Event(String title, String description, NotificationService notificationService) {

        this.id = nextId++;

        this.title = title;

        this.description = description;

        this.completed = false;

        this.notificationService = notificationService;

    }

    

    public int getId() {

        return id;

    }

    

    public String getTitle() {

        return title;

    }

    

    public void setTitle(String title) {

        this.title = title;

    }

    

    public String getDescription() {

        return description;

    }

    

    public void setDescription(String description) {

        this.description = description;

    }

    

    public boolean isCompleted() {

        return completed;

    }

    

    public void setCompleted(boolean completed) {

        this.completed = completed;

        if (completed) {

            notify("Event '" + title + "' marked as completed!");

        }

    }

    

    protected void notify(String message) {

        if (notificationService != null) {

            notificationService.sendNotification(new BasicNotification(message, this));

        }

    }

    

    public abstract String getType();

}