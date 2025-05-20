//import javax.swing.*;
//
//import java.awt.*;
//
///**
//
// * Beta release demonstration of the PlanIt Pro scheduling application.
//
// * This version shows the UI layout with sample data but lacks full functions.
//
// */
//
//public class ScheduleApp extends JFrame {
//
//    /**
//
//     * Constructor creates the application window
//
//     */
//
//    public ScheduleApp() {
//
//        // Set up the window properties
//
//        setTitle("PlanIt Pro");
//
//        setBounds(300, 300, 900, 800);
//
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        setResizable(true);
//
//        
//
//        // Create the beta panel
//
//        SchedulePanel mainPanel = new SchedulePanel();
//
//        
//
//        // Add the panel to the window
//
//        Container windowContainer = getContentPane();
//
//        windowContainer.add(mainPanel);
//
//        
//
//        // Display window
//
//        setLocationRelativeTo(null);
//
//        setVisible(true);
//
//    }
//
//    
//
//    /**
//
//     * Main method to start the application
//
//     */
//
//    public static void main(String[] args) {
//
//        // Create and display the application
//
//        new ScheduleApp();
//
//    }
//
//    
//
//    /**
//
//     *  panel with demonstration content
//
//     */
//
//    class SchedulePanel extends JPanel {
//
//        // Colors
//
//        private Color appColor = new Color(230, 240, 250);  // Light blue
//
//        
//
//        /**
//
//         * Constructor creates the simple beta UI
//
//         */
//
//        public SchedulePanel() {
//
//            setBackground(appColor);
//
//            setLayout(new BorderLayout(10, 10));
//
//            setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
//
//            
//
//            // Add the header, display area, and input form
//
//            add(createHeaderPanel(), BorderLayout.NORTH);
//
//            add(createDisplayPanel(), BorderLayout.CENTER);
//
//            add(createInputPanel(), BorderLayout.SOUTH);
//
//        }
//
//        
//
//        /**
//
//         * Creates the header panel with title and slogan
//
//         */
//
//        private JPanel createHeaderPanel() {
//
//            JPanel panel = new JPanel(new BorderLayout());
//
//            panel.setBackground(appColor);
//
//            panel.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
//
//            
//
//            // App title
//
//            JLabel titleLabel = new JLabel("PlanIt Pro", JLabel.CENTER);
//
//            titleLabel.setFont(new Font("SansSerif", Font.BOLD, 36));
//
//            titleLabel.setForeground(new Color(40, 40, 100));
//
//            
//
//            // Slogan
//
//            JLabel sloganLabel = new JLabel("Plan smarter, achieve more", JLabel.CENTER);
//
//            sloganLabel.setFont(new Font("SansSerif", Font.ITALIC, 22));
//
//            sloganLabel.setForeground(new Color(60, 60, 120));
//
//            
//
//            // Color key panel
//
//            JPanel keyPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
//
//            keyPanel.setBackground(appColor);
//
//            
//
//            JLabel meetingKey = new JLabel("Meeting");
//
//            JPanel meetingColor = new JPanel();
//
//            meetingColor.setBackground(Color.BLUE);
//
//            meetingColor.setPreferredSize(new Dimension(15, 15));
//
//            
//
//            JLabel assignmentKey = new JLabel("Assignment");
//
//            JPanel assignmentColor = new JPanel();
//
//            assignmentColor.setBackground(Color.RED);
//
//            assignmentColor.setPreferredSize(new Dimension(15, 15));
//
//            
//
//            keyPanel.add(meetingColor);
//
//            keyPanel.add(meetingKey);
//
//            keyPanel.add(Box.createHorizontalStrut(20));
//
//            keyPanel.add(assignmentColor);
//
//            keyPanel.add(assignmentKey);
//
//            
//
//            // App title with logo
//
//            JPanel titleWithLogoPanel = new JPanel(new BorderLayout());
//
//            titleWithLogoPanel.setBackground(appColor);
//
//            
//
//            // Create logo panel
//
//            JPanel logoPanel = new JPanel() {
//
//                @Override
//
//                protected void paintComponent(Graphics g) {
//
//                    super.paintComponent(g);
//
//                    
//
//                    // Draw a cute calendar/planner logo
//
//                    int width = 80;
//
//                    int height = 80;
//
//                    
//
//                    // Calendar outline
//
//                    g.setColor(new Color(30, 50, 120));
//
//                    g.fillRoundRect(10, 5, width, height, 10, 10);
//
//                    
//
//                    // Inner calendar background
//
//                    g.setColor(new Color(240, 240, 250));
//
//                    g.fillRoundRect(15, 25, width-10, height-30, 5, 5);
//
//                    
//
//                    // Calendar binding/top
//
//                    g.setColor(new Color(180, 30, 30));
//
//                    g.fillRect(15, 10, width-10, 15);
//
//                    
//
//                    // Calendar hangers
//
//                    g.setColor(new Color(220, 220, 220));
//
//                    g.fillRect(30, 2, 5, 8);
//
//                    g.fillRect(65, 2, 5, 8);
//
//                    
//
//                    // Lines in the calendar
//
//                    g.setColor(new Color(180, 180, 200));
//
//                    g.drawLine(15, 45, width+5, 45);
//
//                    g.drawLine(15, 65, width+5, 65);
//
//                    
//
//                    // Check mark on one item
//
//                    g.setColor(new Color(30, 150, 30));
//
//                    g.setFont(new Font("SansSerif", Font.BOLD, 14));
//
//                    g.drawString("✓", 22, 60);
//
//                    
//
//                    // Pen/pencil
//
//                    g.setColor(new Color(60, 60, 180));
//
//                    g.fillRect(width+15, 30, 6, 40);
//
//                    
//
//                    // Pencil tip
//
//                    g.setColor(new Color(40, 40, 40));
//
//                    int[] xPoints = {width+15, width+18, width+21};
//
//                    int[] yPoints = {70, 78, 70};
//
//                    g.fillPolygon(xPoints, yPoints, 3);
//
//                }
//
//                
//
//                @Override
//
//                public Dimension getPreferredSize() {
//
//                    return new Dimension(120, 90);
//
//                }
//
//            };
//
//            
//
//            // Add the logo and title to the panel
//
//            titleWithLogoPanel.add(logoPanel, BorderLayout.WEST);
//
//            titleWithLogoPanel.add(titleLabel, BorderLayout.CENTER);
//
//            
//
//            // Build the header
//
//            JPanel titlePanel = new JPanel(new BorderLayout());
//
//            titlePanel.setBackground(appColor);
//
//            titlePanel.add(titleWithLogoPanel, BorderLayout.CENTER);
//
//            titlePanel.add(sloganLabel, BorderLayout.SOUTH);
//
//            
//
//            panel.add(titlePanel, BorderLayout.CENTER);
//
//            panel.add(keyPanel, BorderLayout.SOUTH);
//
//            
//
//            return panel;
//
//        }
//
//        
//
//        /**
//
//         * Creates a display panel with sample data
//
//         */
//
//        private JPanel createDisplayPanel() {
//
//            JPanel panel = new JPanel(new BorderLayout());
//
//            panel.setBackground(appColor);
//
//            panel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
//
//            
//
//            // Create the display area with sample data
//
//            JTextArea displayArea = new JTextArea(20, 60);
//
//            displayArea.setEditable(false);
//
//            displayArea.setFont(new Font("SansSerif", Font.PLAIN, 14));
//
//            displayArea.setLineWrap(true);
//
//            displayArea.setWrapStyleWord(true);
//
//            
//
//            // Add sample data
//
//            displayArea.append("ID: 1\n");
//
//            displayArea.append("Title: Math Homework\n");
//
//            displayArea.append("Description: Complete exercises 3-15 on page 42\n");
//
//            displayArea.append("Type: Assignment\n");
//
//            displayArea.append("Course: Mathematics 101\n");
//
//            displayArea.append("Priority: High\n");
//
//            displayArea.append("Status: Pending\n");
//
//            displayArea.append("-----------------\n\n");
//
//            
//
//            displayArea.append("✅ COMPLETED\n");
//
//            displayArea.append("ID: 2\n");
//
//            displayArea.append("Title: Team Project Meeting\n");
//
//            displayArea.append("Description: Discuss project timeline and tasks\n");
//
//            displayArea.append("Type: Meeting\n");
//
//            displayArea.append("Location: Conference Room B\n");
//
//            displayArea.append("Attendees: John, Sarah, Michael, Emma\n");
//
//            displayArea.append("-----------------\n\n");
//
//            
//
//            displayArea.append("ID: 3\n");
//
//            displayArea.append("Title: Research Paper\n");
//
//            displayArea.append("Description: Write 5-page paper on renewable energy\n");
//
//            displayArea.append("Type: Assignment\n");
//
//            displayArea.append("Course: Environmental Science\n");
//
//            displayArea.append("Priority: Urgent\n");
//
//            displayArea.append("Status: Pending\n");
//
//            displayArea.append("-----------------\n\n");
//
//            
//
//            // Add it to a scroll pane
//
//            JScrollPane scrollPane = new JScrollPane(displayArea);
//
//            scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//
//            scrollPane.setMinimumSize(new Dimension(600, 400));
//
//            scrollPane.setPreferredSize(new Dimension(800, 450));
//
//            
//
//            panel.add(scrollPane, BorderLayout.CENTER);
//
//            
//
//            // Add a "Beta Version" label
//
//           
//
//            
//
//            return panel;
//
//        }
//
//        
//
//        /**
//
//         * Creates a simplified input form (non-functional for beta)
//
//         */
//
//        private JPanel createInputPanel() {
//
//            JPanel panel = new JPanel(new BorderLayout(0, 10));
//
//            panel.setBackground(appColor);
//
//            panel.setBorder(BorderFactory.createCompoundBorder(
//
//                BorderFactory.createMatteBorder(1, 0, 0, 0, Color.GRAY),
//
//                BorderFactory.createEmptyBorder(10, 0, 0, 0)
//
//            ));
//
//            
//
//            // Simplified form fields
//
//            JPanel formPanel = new JPanel(new GridLayout(3, 4, 10, 10));
//
//            formPanel.setBackground(appColor);
//
//            
//
//            // Add dummy fields
//
//            formPanel.add(new JLabel("Event Type:"));
//
//            formPanel.add(new JComboBox<>(new String[]{"Assignment", "Meeting"}));
//
//            
//
//            formPanel.add(new JLabel("Title:"));
//
//            formPanel.add(new JTextField());
//
//            
//
//            formPanel.add(new JLabel("Description:"));
//
//            formPanel.add(new JTextField());
//
//            
//
//            formPanel.add(new JLabel("Course:"));
//
//            formPanel.add(new JTextField());
//
//            
//
//            formPanel.add(new JLabel("Priority:"));
//
//            formPanel.add(new JComboBox<>(new String[]{"Low", "Medium", "High", "Urgent"}));
//
//            
//
//            // Add blank cells for spacing
//
//            formPanel.add(new JLabel(""));
//
//            formPanel.add(new JLabel(""));
//
//            
//
//            // Button panel
//
//            JPanel buttonPanel = new JPanel();
//
//            buttonPanel.setBackground(appColor);
//
//            
//
//            JButton addButton = new JButton("Add Event");
//
//            addButton.setBackground(new Color(100, 149, 237));
//
//            addButton.setForeground(Color.BLUE);
//
//            addButton.setFont(new Font("SansSerif", Font.BOLD, 14));
//
//            
//
//            JButton viewButton = new JButton("View Events");
//
//            viewButton.setFont(new Font("SansSerif", Font.BOLD, 14));
//
//            viewButton.setForeground(Color.RED);
//
//            
//
//            JButton markCompleteButton = new JButton("Mark Complete");
//
//            markCompleteButton.setFont(new Font("SansSerif", Font.BOLD, 14));
//
//            markCompleteButton.setForeground(Color.GREEN);
//
//            
//
//            // Add buttons to panel
//
//            buttonPanel.add(addButton);
//
//            buttonPanel.add(viewButton);
//
//            buttonPanel.add(markCompleteButton);
//
//            
//
//            // Add form and buttons to the panel
//
//            panel.add(formPanel, BorderLayout.CENTER);
//
//            panel.add(buttonPanel, BorderLayout.SOUTH);
//
//            
//
//            return panel;
//
//        }
//
//    }
//}