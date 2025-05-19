/**
 * Schedule.java
 * 
 * This class maintains the collection of all events and provides
 * methods to add, retrieve, and manipulate event data.
 * 
 * It serves as the central data store and implements methods for:
 * - Adding new events
 * - Retrieving events by ID
 * - Listing all events
 * - Managing the notification service
 * 
 * - 5/19 gabby notes: making clickable circles color coded based on priority 
 * - how to make the task disappear after?
 * - should it be a separate class? -> 'PriorityCircle.java'?
 * - 
 * - progress bar: automatic! should be .gif if worst comes to worst or moving GUI bar
 * - similar to .jar from previous assignment/test, but instead of 100% done ( w/ running program)
 * - progress bar can increase as the array list/ events are checked off
 * ----- checking off events! will be coded from above segment w/ clickable circles!
 * - required: mouseListener, another class: ProgressBar/TaskTracker?, 
 * - 
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.ArrayList;

public class Schedule {
	private ArrayList<Event> events; //event list 
	private NotificationService notificationService;
	private JPanel canvas;

	public Schedule() {
		events = new ArrayList<>();
		notificationService = new NotificationService();


		canvas = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) //protected (basically private but inherited classes can access)
			{
				// Draw circles for each task, color-coded by priority 
				//(HIGH MEDIUM LOW) - RED YELLOW GREEN.... not coded by color yet
			}
		};
		canvas.addMouseListener(new CircleClickListener()); //canvas object calling mouselistener (tracking mouse)
		// JFrame setup: title, size, exit behavior, etc
	}

	class CircleClickListener extends MouseAdapter { //wait is this nested, should we delete? messy
		@Override
		public void mouseClicked(MouseEvent e) {
			// determine if click was inside a circle -> handle task
		}
	}

	//	private Color getPriorityColor(Priority priority); {
	//		switch(priority) {
	// 		case URGENT:
	// 			return Color.RED;
	//		case HIGH:
	//			return Color.ORANGE;
	//		case MEDIUM:
	//			return Color.YEllOW;
	//		case LOW:
	//			return Color.GREEN;
	//	can the cases use the enum constants? 
	// are these parameters right considering Priority is also the class name?




	public void addEvent(Event event) {
		if (event != null) {
			events.add(event);
		}
	}

	public boolean removeEvent(int id) {
		for (int i = 0; i < events.size(); i++) {
			if (events.get(i).getId() == id) {
				events.remove(i);
				return true;
			}
		}
		return false;
	}

	public Event getEventById(int id) {
		for (Event event : events) {
			if (event.getId() == id) {
				return event;
			}
		}
		return null;
	}

	public ArrayList<Event> getAllEvents() {
		return events;
	}

	public int getEventCount() {
		return events.size();
	}

	public NotificationService getNotificationService() {
		return notificationService;
	}
}
