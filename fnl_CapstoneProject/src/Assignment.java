import java.util.Date;

public class Assignment extends Event  {
	
	//Fields/instance variables (private)
	
	private String course;
	private Priority priority;

	
	public Assignment(String title, String description, Date date, String course, Priority priority, int progress) {
		super(title, description, date);
		this.course = course;
		this.priority = priority;
		}
	
	public String getCourse() 
	{
		return course;
	}
	
	public String setCourse(String course)
	{
		return this.course = course;
	}
	
	public Priority getPriority()
	{
		return priority;
		
	}
	
	public Priority setPriority(Priority priority)
	{
		return this.priority = priority;
	}
	
}

//ADD A TOSTRING METHOD