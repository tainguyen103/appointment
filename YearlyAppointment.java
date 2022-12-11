package appointment;

public class YearlyAppointment extends Appointment {
 
    private final int year;
    private final int month;
    private final int day;

  
    /**
     * @param title
     * @param year
     * @param month
     * @param day
     */
    public YearlyAppointment(String title, int year, int month, int day) {
        super(title);
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /**
     * @return true if the year, the month and the day matches
     */
    @Override
    public boolean occursOn(int year, int month, int day) {
        return this.year == year && this.month == month && this.day == day;
    }
}
