package appointment;

public abstract class Appointment {
	
    private String title; //The title of the appointment
    
    /**
     * constructor
     * @param title
     */
    public Appointment(String title){
    	this.title = title;
    }

    /**
     * getter
     * @return title
     */
    public String getTitle() {
    	return title;
    	}
    
    
    /**
     * @param year
     * @param month
     * @param day
     */
    abstract public boolean occursOn(int year, int month, int day);
}
