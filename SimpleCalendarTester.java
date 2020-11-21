/**
 * @author Ripandeep singh
 * tester file for Calender
 */
public class SimpleCalendarTester {
    public static void main(String[] args)
    {
        CalenderModel calenderModel = new CalenderModel();
        CalenderObserver calenderObserver = new CalenderObserver(calenderModel);
        calenderModel.attach(calenderObserver);
    }
}
