/**
 * Priority.java
 * Enum representing different priority levels for events.
 */
public enum Priority {
    LOW,
    MEDIUM,
    HIGH,
    URGENT;
    
  
    public static Priority fromInt(int value) {
        switch(value) {
            case 1: return LOW;
            case 2: return MEDIUM;
            case 3: return HIGH;
            case 4: return URGENT;
            default: return MEDIUM; // Default to MEDIUM if invalid
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