import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Event {
    // Static counter for IDs
    private static int nextId = 1;
    
    // Instance variables
    private int id;
    private String title;
    private String description;
    private Date date;
    private EventStatus status;
    private Category category;
    
    
    public Event(String title, String description, Date date) {
        this.id = nextId++;
        this.title = title;
        this.description = description;
        this.date = date;
        this.status = EventStatus.PENDING;
    }
}