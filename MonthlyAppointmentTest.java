package appointment;

import static org.junit.Assert.*;

import org.junit.Test;

public class MonthlyAppointmentTest {

    MonthlyAppointment monthlyAppointment = new MonthlyAppointment("monthly", 2);

    @Test
    public void getTitle() {
        // equality
        assertEquals("monthly", monthlyAppointment.getTitle());
    }

    @Test
    public void occursOn() {
        // trueness
        assertTrue(monthlyAppointment.occursOn(0, 0, 2));
    }

}
