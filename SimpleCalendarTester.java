/**
 * @author Ripandeep singh
 * tester file for Calender
 */
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.util.GregorianCalendar;

public class SimpleCalendarTester {
    public static void main(String[] args)
    {
        CalenderModel calenderModel = new CalenderModel();
        CalenderObserver calenderObserver = new CalenderObserver(calenderModel);
        calenderModel.attach(calenderObserver);
      //  calenderObserver.visualize();

    }
}
