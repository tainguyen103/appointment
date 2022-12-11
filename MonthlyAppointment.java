package appointment;

public class MonthlyAppointment extends Appointment {

    private int day;
    
    /**
     * @param title
     * @param day
     */
    public MonthlyAppointment(String title, int day) {
        super(title);
        this.day = day;
    }
    
    /**
     * if day matches then it is the appointment day
     */
    @Override
    public boolean occursOn(int year, int month, int day) {
        return this.day == day;
    }
}