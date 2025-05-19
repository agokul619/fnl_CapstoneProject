import java.awt.Color;

/**
 * Priority.java
 * Enum representing different priority levels for events.
 */
public enum Priority {
	LOW,
	MEDIUM,
	HIGH,
	URGENT;

	//    public static Priority fromInt(int value) {
	//        switch(value) {
	//            case 1: return LOW;
	//          //  return Color.GREEN; 
	//          //why can't i replace all return statements to make the Color circle in the case of those constants?
	//            case 2: return MEDIUM;
	//            case 3: return HIGH;
	//            case 4: return URGENT;
	//            default: return MEDIUM; // Default to MEDIUM if invalid
	//        }
	//    }

	// color for each priority level
	public Color getPriorityColor() {
		switch (this) {
		case LOW:
			return Color.GREEN;
		case MEDIUM:
			return Color.YELLOW;
		case HIGH:
			return Color.ORANGE;
		case URGENT:
			return Color.RED;
		default:
			return Color.GRAY; // if no priority matches
		}
	}

	public int toInt() {
		switch(this) {
		case LOW: return 1;
		case MEDIUM: return 2;
		case HIGH: return 3;
		case URGENT: return 4;
		default: return 2; // Should never happen
		}
	}


	public String toString() {
		switch(this) {
		case LOW: return "Low";
		case MEDIUM: return "Medium";
		case HIGH: return "High";
		case URGENT: return "Urgent";
		default: return "Unknown"; // Should never happen
		}
	}
}