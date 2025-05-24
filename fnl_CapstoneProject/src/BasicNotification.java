//Author: Gabby Moll
//Rev date: 5/15/25

public class BasicNotification {

    private String message;
    private Event source;

    public BasicNotification(String message, Event source) 
    {
        this.message = message;
        this.source = source;
    }

    public String getMessage() 
    {
        return message;
    }

    

    public Event getSource() 
    {
    	return source;
    }

}