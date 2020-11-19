/**
 * A class to represent an event
 */
public class Event {
    private String eventName;
    private TimeInterval timeInterval;
    /**
     * constructs an object of Event
     */
    public Event(){}

    /**
     * constructs an object of Event with name
     * @param eName: event name
     */
    public Event(String eName)
    {
        this.eventName = eName;
    }
    /**
     * getting name of the event
     * @return eventName
     */
    public String getEventName()
    {
        return this.eventName;
    }

    /**
     *getting the time interval of event
     * @return TimeInterval
     */
    public TimeInterval getTimeInterval()
    {
        return this.timeInterval;
    }
    /**
     * set event name
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
    /**
     * set TimeInterval
     */
    public void setTimeInterval(TimeInterval timeInterval) {
        this.timeInterval = timeInterval;
    }
}
