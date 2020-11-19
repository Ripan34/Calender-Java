/**
 * controller class of calender
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;

public class CalenderController {
    private CalenderModel cModel; //calender model
    private ArrayList<String> dates; //to hold dates
    private CalenderManager calenderManager; //calender manager object
    /**
     * constructs a CalenderController object
     */
    public CalenderController(CalenderModel mod)
    {
        calenderManager = new CalenderManager();
        cModel = mod;
        dates = new ArrayList<String>();
    }
    /**
     * function to get next month's dates
     */
    public void getNextDates()
    {
        dates = calenderManager.getNextDate();
        cModel.update(dates); //update the model object
    }
    /**
     * to get previous month's dates
     */
    public void getPreviousDates()
    {
        dates = calenderManager.getPreviousDate();
        cModel.update(dates); //update the model object
    }
}