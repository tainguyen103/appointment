package appointment;

import java.util.Scanner;

public class AppointmentDemo {
    public static void main(String[] args) {
        // scanner object to take user inputs
        Scanner scanner = new Scanner(System.in);

        // an array for holding the appointments
        Appointment[] appointments = new Appointment[3];

        // creating appointments
        DailyAppointment dailyAppointment = new DailyAppointment("Family visit");
        MonthlyAppointment monthlyAppointment = new MonthlyAppointment("Dentist", 5);
        YearlyAppointment yearlyAppointment = new YearlyAppointment("Get overall check-up", 2022, 5, 5);

        // adding appointments to the array
        appointments[0] = dailyAppointment;
        appointments[1] = monthlyAppointment;
        appointments[2] = yearlyAppointment;

        // asking for input (date)
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        System.out.print("Enter month: ");
        int month = scanner.nextInt();
        System.out.print("Enter day: ");
        int day = scanner.nextInt();

        // for each appointment
        for (Appointment appointment: appointments) {
            // if there is appointment on this day then print it
            if (appointment.occursOn(year, month, day)) {
                System.out.println(appointment.getTitle());
            }
        }
    }
}
