/**
 * Model class for calender
 */
import java.util.ArrayList;
import java.util.Collections;

public class CalenderModel {
    /**
     * constructs a Calender model object
     */
    public CalenderModel()
    {
        dates = new ArrayList<String>();
    }
    /**
     * to attach listeners
     */
    public void attach(CalenderObserver ob)
    {
        this.observer = ob;
    }
    /**
     * to update the data
     */
    public void update(ArrayList<String> dt)
    {
        dates = (ArrayList<String>) dt.clone();
        observer.notifyData();
    }
    /**
     * to get data
     * @return ArrayList<>
     */
    public ArrayList<String> getData()
    {
        return (ArrayList<String>) dates.clone();
    }
    private ArrayList<String> dates;
    private CalenderObserver observer;
}
