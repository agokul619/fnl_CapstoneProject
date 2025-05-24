/**

 * Assignment.java
 * Represents academic assignments in the scheduling system
 * This class extends the Event class to add assignment-specific
 * properties such as:
 * - Course name
 * - Priority level
 * - Due dates
 * It implements custom notification logic based on priority levels.
 */

//Authors: Ishanvi Deodhar, Aditi Gokul
//Rev date: 5/19/25


public class Assignment extends Event 
{

    private String course;
    private Priority priority;


    public Assignment(String title, String description, String course, Priority priority, NotificationService notificationService) 
    {
        super(title, description, notificationService);
        this.course = course;
        this.priority = priority;
    }

    public String getCourse() 
    {
        return course;
    }

    public void setCourse(String course) 
    {
        this.course = course;
    }

    public Priority getPriority() 
    {
        return priority;
    }

    public void setPriority(Priority priority) 
    {
        this.priority = priority;
    }

    @Override

    public String getType() 
    {
        return "Assignment";
    }

}