
public class SchedulePrinter {
	
	
	/* console output class
	 * simple scanner keyboard and main method invoking user to:
	 * add
	 * label eventID automatically based on  how many events prev inputted
	 * add/remove event feature "would you like", invoke from class.
	 * PROMPT USER ASK FOR below features of the event they are scheduling 
	 * event type: 1 for assignment 2 for meeting
	 * priority: choose low medium high urgent type 1234 for each
	 * title:  type, prints
	 * Description: type, prints
	 * Course: type, prints
	 * 
	 * Reason for creating class: 
	 * restart due to issues with GUI, multiple panels despite rubric (1 panel, 1 window)
	 * serves as user interaction/interface instead of a window with drop down menus
	 * overall: probable action -> deleting graphics.
	 */
	public static void main(String[] args) {

		System.out.println("Would you like to add an event?");



		System.out.println("ID: 1\n");
		System.out.println("Title: Math Homework\n");

		System.out.println("Description: Complete exercises 3-15 on page 42\n");

		System.out.println("Type: Assignment\n");

		System.out.println("Course: Mathematics 101\n");

		System.out.println("Priority: High\n");

		System.out.println("Status: Pending\n");

		System.out.println("-----------------\n\n");




		System.out.println("✅ COMPLETED\n");

		System.out.println("ID: 2\n");

		System.out.println("Title: Team Project Meeting\n");

		System.out.println("Description: Discuss project timeline and tasks\n");

		System.out.println("Type: Meeting\n");

		System.out.println("Location: Conference Room B\n");

		System.out.println("Attendees: John, Sarah, Michael, Emma\n");

		System.out.println("-----------------\n\n");



		System.out.println("ID: 3\n");

		System.out.println("Title: Research Paper\n");

		System.out.println("Description: Write 5-page paper on renewable energy\n");

		System.out.println("Type: Assignment\n");

		System.out.println("Course: Environmental Science\n");

		System.out.println("Priority: Urgent\n");

		System.out.println("Status: Pending\n");

		System.out.println("-----------------\n\n");
	}
}
