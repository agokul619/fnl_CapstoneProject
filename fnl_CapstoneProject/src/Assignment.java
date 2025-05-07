import java.util.Date;

public class Assignment extends Event  {
	
	//Fields/ihnstance varibales(private)
	
	private String course;
	private Priority priority;
	private int progress;

	
	public Assignment(String title, String description, Date date, String course, Priority priority) {
		//super(title, description, date);
		this.course = course;
		this.priority = priority;
	}
}
