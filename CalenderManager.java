/**
 * to manage all the calender functionality
 */
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalenderManager {
    private LocalDateTime localDateTime;

    /**
     * to construct a CalenderManger Object
     */
    public CalenderManager()
    {
        localDateTime = LocalDateTime.now();
    }
    /**
     * to get new Dates
     */
    public ArrayList<String> getNextDate()
    {
        ArrayList<String> nextDates = new ArrayList<String>();
        localDateTime = localDateTime.plusMonths(1);
        localDateTime = localDateTime.withDayOfMonth(1);
        nextDates.add(localDateTime.getMonth().name() + " " + localDateTime.getYear());
        nextDates.add(localDateTime.getDayOfWeek().name());
        for(int i = 1; i <= localDateTime.toLocalDate().lengthOfMonth(); i++)
        {
            nextDates.add(String.valueOf(i));
        }
        return nextDates;
    }
    /**
     * to get previous dates
     */
    public ArrayList<String> getPreviousDate()
    {
        ArrayList<String> previousDates = new ArrayList<String>();
        localDateTime = localDateTime.minusMonths(1);
        localDateTime = localDateTime.withDayOfMonth(1);
        previousDates.add(localDateTime.getMonth().name() + " " + localDateTime.getYear());
        previousDates.add(localDateTime.getDayOfWeek().name());
        for(int i = 1; i <= localDateTime.toLocalDate().lengthOfMonth(); i++)
        {
            previousDates.add(String.valueOf(i));
        }
        return previousDates;
    }
    /**
     * to get current month dates
     */
    public ArrayList<String> getCurrentDates()
    {
        ArrayList<String> currentDates = new ArrayList<String>();
        for(int i = 1; i <= localDateTime.toLocalDate().lengthOfMonth(); i++)
        {
            currentDates.add(String.valueOf(i));
        }
        return currentDates;
    }
}