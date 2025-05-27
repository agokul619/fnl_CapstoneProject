//Author: Ishanvi Deodhar
//Rev date: 5/13/25

import java.awt.Color;

/**
 * Priority.java
 * Enum representing different priority levels for events.
 */
public enum Priority 
{
	//enum constants
	
	LOW,
	MEDIUM,
	HIGH,
	URGENT;
	
    //Converts an integer value to the corresponding Priority enum


	public static Priority fromInt(int value) 
	{
		switch(value) {
			case 1: return LOW;
			case 2: return MEDIUM;
			case 3: return HIGH;
			case 4: return URGENT;
			default: return MEDIUM; // Default to MEDIUM if invalid
		}
	}

	//Converts the Priority enum to its corresponding integer value.

	public int toInt() 
	{
		switch(this) 
		{
			case LOW: return 1;
			case MEDIUM: return 2;
			case HIGH: return 3;
			case URGENT: return 4;
			default: return 2; // Should never happen
		}
	}

	//Returns a user-friendly string representation of the priority.

	public String toString() 
	{
		switch(this) 
		{
			case LOW: return "Low";
			case MEDIUM: return "Medium";
			case HIGH: return "High";
			case URGENT: return "Urgent";
			default: return "Unknown"; // Should never happen
		}
	}
}