package appointment;

public class DailyAppointment extends Appointment {
	
    /**
     * constructor
     * @param title
     */
    public DailyAppointment(String title) {
        super(title);
    }
    
    /**
     * @return true for each day
     */
    @Override
    public boolean occursOn(int year, int month, int day) {
        return true;
    }
}

