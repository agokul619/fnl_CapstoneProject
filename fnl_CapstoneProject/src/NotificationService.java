//Author: Ishanvi Deodhar
//Rev date: 5/13/25

public class NotificationService 
{

    public NotificationService() 
    {
    	
    }

    public void sendNotification(BasicNotification notification) 
    {
        System.out.println("NOTIFICATION: " + notification.getMessage());
    }

}