//Author: Ishanvi Deodhar
//Rev date: 5/15/25

public enum EventStatus {
	PENDING, 
	IN_PROGRESS, 
	COMPLETED, 
	CANCELLED;
	
	public String toString()
	{
		switch (this) {
	        case PENDING:
	        	return "Pending";
	        case COMPLETED:
	        	return "Completed";
	        default:
	            return "Unknown";
		}
	}
	

}
