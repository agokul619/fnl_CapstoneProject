import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

public class ScheduleApp extends JFrame {
    // Core components
    private Schedule schedule;
    private JTextArea displayArea;
    
    // Input fields
    private JComboBox<String> typeCombo;
    private JTextField titleField;
    private JTextField descriptionField;
    private JTextField locationField;
    private JTextField attendeesField;
    private JTextField courseField;
    private JComboBox<String> priorityCombo;
    
    // Panels
    private JPanel mainPanel;
    private JPanel headerPanel;
    private JPanel inputPanel;
    private JPanel buttonPanel;
    private JPanel assignmentPanel;
    private JPanel meetingPanel;
    private JPanel cardPanel;
    private CardLayout cardLayout;
    
    // Colors
    private Color headerColor = new Color(220, 240, 250);  // Light blue
    private Color buttonColor = new Color(100, 149, 237);  // Cornflower blue
    
    /**
     * Constructor initializes the schedule and UI components
     */
    public ScheduleApp() {
        // Initialize the schedule
        schedule = new Schedule();
        
        // Set up the window
        setTitle("PlanIt Pro");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        // Create the components
        createGUI();
        
        // Display window
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    /**
     * Creates the main GUI components and layout
     */
    private void createGUI() {
        // Main panel
        mainPanel = new JPanel(new BorderLayout());
        
        // Create header
        createHeaderPanel();
        
        // Create display area
        displayArea = new JTextArea();
        displayArea.setEditable(false);
        displayArea.setFont(new Font("Arial", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(displayArea);
        
        // Create input form
        createInputPanel();
        
        // Add components to main panel
        mainPanel.add(headerPanel, BorderLayout.NORTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        mainPanel.add(inputPanel, BorderLayout.SOUTH);
        
        // Add main panel to frame
        add(mainPanel);
        
        // Show initial events
        updateEventDisplay();
    }

	private void updateEventDisplay() {
		// TODO Auto-generated method stub
		
	}

	private void createInputPanel() {
		 inputPanel = new JPanel();
	        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));
	        inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
	        
	        // Create type selection and common fields
	        JPanel commonFields = new JPanel(new GridLayout(4, 2, 10, 10));
	        
	        // Event type
	        commonFields.add(new JLabel("Event Type:"));
	        typeCombo = new JComboBox<>(new String[]{"Assignment", "Meeting"});
	        commonFields.add(typeCombo);
	        
	        // Title
	        commonFields.add(new JLabel("Title:"));
	        titleField = new JTextField();
	        commonFields.add(titleField);
	        
	        // Description
	        commonFields.add(new JLabel("Description:"));
	        descriptionField = new JTextField();
	        commonFields.add(descriptionField);
	        
	        // Create assignment specific panel
	        assignmentPanel = new JPanel(new GridLayout(2, 2, 10, 10));
	        
	        assignmentPanel.add(new JLabel("Course:"));
	        courseField = new JTextField();
	        assignmentPanel.add(courseField);
	        
	        assignmentPanel.add(new JLabel("Priority:"));
	        priorityCombo = new JComboBox<>(new String[]{"Low", "Medium", "High", "Urgent"});
	        assignmentPanel.add(priorityCombo);
	        
	        // Create meeting specific panel
	        meetingPanel = new JPanel(new GridLayout(2, 2, 10, 10));
	        
	        meetingPanel.add(new JLabel("Location:"));
	        locationField = new JTextField();
	        meetingPanel.add(locationField);
	        
	        meetingPanel.add(new JLabel("Attendees:"));
	        attendeesField = new JTextField();
	        meetingPanel.add(attendeesField);
	        
	        // Create card layout for switching between assignment and meeting
	        cardLayout = new CardLayout();
	        cardPanel = new JPanel(cardLayout);
	        cardPanel.add(assignmentPanel, "ASSIGNMENT");
	        cardPanel.add(meetingPanel, "MEETING");
	        
	        // Button panel
	        buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
	        
	        JButton addButton = new JButton("Add Event");
	        addButton.setBackground(new Color(0, 0, 255));
	        addButton.setForeground(Color.WHITE);
	        
	        JButton viewButton = new JButton("View Events");
	        viewButton.setBackground(new Color(255, 0, 0));
	        viewButton.setForeground(Color.WHITE);
	        
	        JButton markCompleteButton = new JButton("Mark Complete");
	        markCompleteButton.setBackground(new Color(0, 255, 0));
	        markCompleteButton.setForeground(Color.WHITE);
	        
	      
	        // Add buttons to panel
	        buttonPanel.add(addButton);
	        buttonPanel.add(viewButton);
	        buttonPanel.add(markCompleteButton);
	        
	        // Add type selection listener
	        typeCombo.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                String selectedType = (String) typeCombo.getSelectedItem();
	                if ("Assignment".equals(selectedType)) {
	                    cardLayout.show(cardPanel, "ASSIGNMENT");
	                } else {
	                    cardLayout.show(cardPanel, "MEETING");
	                }
	            }
	        });
	        
	        // Add all components to input panel
	        inputPanel.add(commonFields);
	        inputPanel.add(cardPanel);
	        inputPanel.add(buttonPanel);
	    }
		
	
	private void createHeaderPanel() {
	    headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBackground(headerColor);
        headerPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Create app title
        JLabel titleLabel = new JLabel("PlanIt Pro", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 28));
        titleLabel.setForeground(new Color(60, 60, 60));
		
	}
	


public static void main(String[] args) {
    new ScheduleApp();
}
}
  
    