import java.util.Scanner;

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

        Scanner kboard = new Scanner(System.in);
        int eventCount = 0;

        while (true) {
            System.out.println("Would you like to add an event");
            System.out.println("Type 1 for yes");
            System.out.println("Type 2 for no");

            int answer = kboard.nextInt();
            kboard.nextLine(); // move to next line

            if (answer == 1) {
                eventCount++;

                // Ask for type until valid input
                String type = "Unknown";
                int typeChoice = 0;
                while (typeChoice != 1 && typeChoice != 2) {
                    System.out.println("Enter the event type");
                    System.out.println("Type 1 for Assignment");
                    System.out.println("Type 2 for Meeting");
                    typeChoice = kboard.nextInt();
                    kboard.nextLine();
                    if (typeChoice == 1) {
                        type = "Assignment";
                    } else if (typeChoice == 2) {
                        type = "Meeting";
                    } else {
                        System.out.println("Invalid input. Please try again.");
                    }
                }

                // Ask for priority until valid
                String priority = "Unknown";
                int priorityInput = 0;
                while (priorityInput < 1 || priorityInput > 4) {
                    System.out.println("Choose priority");
                    System.out.println("Type 1 for Low");
                    System.out.println("Type 2 for Medium");
                    System.out.println("Type 3 for High");
                    System.out.println("Type 4 for Urgent");
                    priorityInput = kboard.nextInt();
                    kboard.nextLine();

                    if (priorityInput == 1) {
                        priority = "Low";
                    } else if (priorityInput == 2) {
                        priority = "Medium";
                    } else if (priorityInput == 3) {
                        priority = "High";
                    } else if (priorityInput == 4) {
                        priority = "Urgent";
                    } else {
                        System.out.println("Invalid input. Please try again.");
                    }
                }

                // Get title, description, course
                System.out.println("Enter title: ");
                String title = kboard.nextLine();

                System.out.println("Enter description: ");
                String description = kboard.nextLine();

                System.out.println("Enter course: ");
                String course = kboard.nextLine();

                // Print everything back to user
                System.out.println();
                System.out.println("Event Summary");
                System.out.println("ID: " + eventCount);
                System.out.println("Title: " + title);
                System.out.println("Description: " + description);
                System.out.println("Type: " + type);
                System.out.println("Course: " + course);
                System.out.println("Priority: " + priority);
                System.out.println("Status Pending");
                System.out.println("----------");
                System.out.println();

            } else if (answer == 2) {
                System.out.println("Exiting");
                break;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }

        kboard.close();
    }
		
//		int x, y;
//		Scanner kboard;
//		kboard = new Scanner(System.in);
//
//		System.out.println("Would you like to add an event?");
//		System.out.println("Enter a number: 1 for yes, 2 for no");
//		x = kboard.nextInt();
//		System.out.println("What is the event description");
//		System.out.println("Would you like to add an event?");
//		System.out.println("Would you like to add an event?");
//		System.out.println("Would you like to add an event?");
//		System.out.println("Would you like to add an event?");
//		System.out.println("Would you like to add an event?");
//		System.out.println("Would you like to add an event?");
//
//


		//		System.out.println("ID: 1\n");
		//		System.out.println("Title: Math Homework\n");
		//
		//		System.out.println("Description: Complete exercises 3-15 on page 42\n");
		//
		//		System.out.println("Type: Assignment\n");
		//
		//		System.out.println("Course: Mathematics 101\n");
		//
		//		System.out.println("Priority: High\n");
		//
		//		System.out.println("Status: Pending\n");
		//
		//		System.out.println("-----------------\n\n");
		//
		//
		//
		//
		//		System.out.println("✅ COMPLETED\n");
		//
		//		System.out.println("ID: 2\n");
		//
		//		System.out.println("Title: Team Project Meeting\n");
		//
		//		System.out.println("Description: Discuss project timeline and tasks\n");
		//
		//		System.out.println("Type: Meeting\n");
		//
		//		System.out.println("Location: Conference Room B\n");
		//
		//		System.out.println("Attendees: John, Sarah, Michael, Emma\n");
		//
		//		System.out.println("-----------------\n\n");
		//
		//
		//
		//		System.out.println("ID: 3\n");
		//
		//		System.out.println("Title: Research Paper\n");
		//
		//		System.out.println("Description: Write 5-page paper on renewable energy\n");
		//
		//		System.out.println("Type: Assignment\n");
		//
		//		System.out.println("Course: Environmental Science\n");
		//
		//		System.out.println("Priority: Urgent\n");
		//
		//		System.out.println("Status: Pending\n");
		//
		//		System.out.println("-----------------\n\n");
	}

