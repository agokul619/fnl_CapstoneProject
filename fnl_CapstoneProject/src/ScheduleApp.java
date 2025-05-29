import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

/*
 * ScheduleApp.java 
 * 
 * Our attempt at a basic PlanIt Pro app with just enough
 * GUI to be usable without getting too complex.
 * Still needs some work but gets the job done!
 */

//Authors: Ishanvi Deodhar, Aditi Gokul, Gabby Moll
//Rev date: 5/23/25


public class ScheduleApp extends JFrame {
    // Main stuff we need
    private Schedule mySchedule; 
    private JTextArea eventList; 
    
    // Form controls
    private JComboBox<String> eventType;
    private JTextField nameBox;
    private JTextField detailsBox;
    private JTextField courseLocBox; 
    private JTextField peopleBox;
    private JComboBox<String> importanceBox;
    
    
    // Constructor - sets up our window
    public ScheduleApp() 
    {
        // Start with an empty schedule
        mySchedule = new Schedule();
        
        // Set up the main window
        setTitle("PlanIt Pro");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Use simple spacing between elements
        setLayout(new BorderLayout(10, 10));
        
        // Set up all the buttons
        buildUI();
        
        // Center and show
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    // Creates all the UI components we need
    private void buildUI() 
    {
        // App name at top
        JLabel appTitle = new JLabel("PlanIt Pro", JLabel.CENTER);
        appTitle.setFont(new Font("Arial", Font.BOLD, 20));
        add(appTitle, BorderLayout.NORTH);
        
        // Big text area to show our events
        eventList = new JTextArea();
        eventList.setEditable(false);
        JScrollPane scrollBox = new JScrollPane(eventList);
        add(scrollBox, BorderLayout.CENTER);
        
        // Form for adding stuff
        JPanel formSection = new JPanel();
        formSection.setLayout(new GridLayout(7, 2, 5, 5));
        
        // Event type dropdown
        formSection.add(new JLabel("Type:"));
        eventType = new JComboBox<>(new String[]{"Assignment", "Meeting"});
        formSection.add(eventType);
        
        // Name/title box
        formSection.add(new JLabel("Title:"));
        nameBox = new JTextField();
        formSection.add(nameBox);
        
        // Details box
        formSection.add(new JLabel("Description:"));
        detailsBox = new JTextField();
        formSection.add(detailsBox);
        
        // Course or location field (changes based on type)
        formSection.add(new JLabel("Course/Location:"));
        courseLocBox = new JTextField();
        formSection.add(courseLocBox);
        
        // How important is it?
        formSection.add(new JLabel("Priority:"));
        importanceBox = new JComboBox<>(new String[]{"Low", "Medium", "High", "Urgent"});
        formSection.add(importanceBox);
        
        // Who's coming? (for meetings)
        formSection.add(new JLabel("Attendees:"));
        peopleBox = new JTextField();
        formSection.add(peopleBox);
        
        //set initial field states
        importanceBox.setEnabled(true);
        peopleBox.setEnabled(false);
        
        // Buttons at the bottom
        JPanel buttonRow = new JPanel();
        
        // The big three buttons we need
        JButton saveBtn = new JButton("Add Event");
        saveBtn.addActionListener(e -> saveNewEvent());
        buttonRow.add(saveBtn);
        saveBtn.setBackground(Color.CYAN);
        
        JButton doneBtn = new JButton("Mark Complete");
        doneBtn.addActionListener(e -> markEventDone());
        buttonRow.add(doneBtn);
        doneBtn.setBackground(Color.green);
        
        // Put the form and buttons together
        JPanel bottomSection = new JPanel(new BorderLayout());
        bottomSection.add(formSection, BorderLayout.CENTER);
        bottomSection.add(buttonRow, BorderLayout.SOUTH);
        
        // Add to main window
        add(bottomSection, BorderLayout.SOUTH);
        
        // Make the form adapt to what we're adding
        eventType.addActionListener(e -> 
        {
            boolean isHomework = "Assignment".equals(eventType.getSelectedItem());
            importanceBox.setEnabled(isHomework);
            peopleBox.setEnabled(!isHomework);
        });
        
        // Show initial events (if any)
        refreshEventList();
    }
    
    // Saves whatever is in the form as a new event
    private void saveNewEvent() 
    {
        String title = nameBox.getText().trim();
        if (title.isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "Hey, you need a title!");
            return;
        }
        
        String desc = detailsBox.getText().trim();
        String thirdField = courseLocBox.getText().trim();
        
        if (thirdField.isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "Don't forget to fill in all fields!");
            return;
        }
        
        boolean isHomework = "Assignment".equals(eventType.getSelectedItem());
        
        if (isHomework) 
        {
            // Handle homework/assignment
            String importanceLevel = (String) importanceBox.getSelectedItem();
            Priority howImportant = Priority.MEDIUM; // default
            
            // Figure out the priority level
            if (importanceLevel.equals("Low")) 
            {
                howImportant = Priority.LOW;
            } 
            else if (importanceLevel.equals("High")) 
            {
                howImportant = Priority.HIGH;
            } 
            else if (importanceLevel.equals("Urgent")) 
            {
                howImportant = Priority.URGENT;
            }
            
            Assignment homework = new Assignment(title, desc, thirdField, howImportant, mySchedule.getNotificationService());
            mySchedule.addEvent(homework);
        } 
        else 
        {
            // Handle meeting
            Meeting meetup = new Meeting(title, desc, thirdField, mySchedule.getNotificationService());
            
            // Add people to the meeting
            String peopleText = peopleBox.getText().trim();
            if (!peopleText.isEmpty()) 
            {
                String[] people = peopleText.split(",");
                for (String person : people) 
                {
                    String name = person.trim();
                    if (!name.isEmpty()) 
                    {
                        meetup.addAttendee(name);
                    }
                }
            }
            
            mySchedule.addEvent(meetup);
        }
        
        // Clear the form
        nameBox.setText("");
        detailsBox.setText("");
        courseLocBox.setText("");
        peopleBox.setText("");
        
        // Show the updated list
        refreshEventList();
        JOptionPane.showMessageDialog(this, "Got it! Event added.");
    }
    
    // Updates the display with current events
    private void refreshEventList() 
    {
        ArrayList<Event> events = mySchedule.getAllEvents();
        
        if (events.isEmpty()) 
        {
            eventList.setText("Nothing on your schedule yet. Add something below!");
            return;
        }
        
        eventList.setText("");
        
        for (int i = 0; i < events.size(); i++) 
        {
        	Event event = events.get(i);

            // Show checkmark if it's done
            if (event.isCompleted()) 
            {
                eventList.append("✔ COMPLETED\n");
            }
            
            // Basic info everyone needs
            eventList.append("ID: " + event.getId() + "\n");
            eventList.append("Title: " + event.getTitle() + "\n");
            
            if (event.getDescription() != null && !event.getDescription().isEmpty()) 
            {
                eventList.append("Description: " + event.getDescription() + "\n");
            }
            
            String eventType = event.getType();
           
            // Different info based on type
            if (eventType.equals("Assignment"))
            {
                // It's homework
                Assignment homework = (Assignment) event;
                eventList.append("Type: Assignment 📚\n");
                eventList.append("Course: " + homework.getCourse() + "\n");
                eventList.append("Priority: " + homework.getPriority() + "\n");
            } 
            else if (eventType.equals("Meeting")) 
            {
                // It's a meeting
                Meeting meetup = (Meeting) event;
                eventList.append("Type: Meeting 📝📅👥💼 \n ");
                eventList.append("Location: " + meetup.getLocation() + "\n");
                eventList.append("Attendees: " + meetup.getAttendeeList() + "\n");
            }
            
            String status;
            if (event.isCompleted()) 
            {
                status = "Completed";
            } 
            else 
            {
                status = "Pending";
            }
            eventList.append("Status: " + status + "\n"); 
            
            //add the separator
            
            eventList.append("------------------------\n");
        }
    }
    
    // Marks an event as finished
    private void markEventDone() 
    {
        String idText = JOptionPane.showInputDialog(this, "Which event ID do you want to mark as done?");
        if (idText == null || idText.trim().isEmpty()) return;
        
        try {
            int id = Integer.parseInt(idText);
            Event event = mySchedule.getEventById(id);
            
            if (event == null) 
            {
                JOptionPane.showMessageDialog(this, "Hmm, couldn't find that one. Check the ID?");
                return;
            }
            
            event.setCompleted(true);
            refreshEventList();
            JOptionPane.showMessageDialog(this, "Nice! Marked as complete.");
        } 
        catch (NumberFormatException e) 
        {
            JOptionPane.showMessageDialog(this, "That doesn't look like a number. Try again?");
        }
    }
    
    // Main method - where it all begins
    public static void main(String[] args) {
     
        new ScheduleApp();
    }
} 