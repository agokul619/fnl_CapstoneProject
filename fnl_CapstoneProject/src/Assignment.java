import java.util.Date;

public class Assignment extends Event  {
	
	//Fields/instance variables (private)
	
	private String course;
	private Priority priority;
	private int progress;

	
	public Assignment(String title, String description, Date date, String course, Priority priority, int progress) {
		super(title, description, date);
		this.course = course;
		this.priority = priority;
		this.progress = progress;
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
	
	public Priority etPriority(Priority priority)
	{
		return this.priority = priority;
	}
	
	public int getProgress()
	{
		return progress;
	}
	
	public int setProgress()
	{
		return this.progress = progress;
	}
}
