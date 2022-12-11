package appointment;

import static org.junit.Assert.*;

import org.junit.Test;

public class DailyAppointmentTest {

    DailyAppointment dailyAppointment = new DailyAppointment("Dentist");

    @Test
    public void getTitle() {
        // checking the equality
        assertEquals("Dentist", dailyAppointment.getTitle());
    }

    @Test
    public void occursOn() {
        // checking the trueness
        assertTrue(dailyAppointment.occursOn(2, 2, 2));
    }
}
