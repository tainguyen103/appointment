package appointment;

import static org.junit.Assert.*;

import org.junit.Test;

public class YearlyAppointmentTest {

	YearlyAppointment yearlyAppointment = new YearlyAppointment("yearly", 2022, 2, 2);

    @Test
    public void getTitle() {
        // equality
        assertEquals("yearly", yearlyAppointment.getTitle());
    }

    @Test
    public void occursOn() {
        // trueness
        assertTrue(yearlyAppointment.occursOn(2022, 2, 2));
    }
}
