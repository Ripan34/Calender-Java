/**
 * Time Interval Class
 **/

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeInterval
{
    private LocalDateTime start;
    private LocalDateTime end;

    /**
     * constructs a TimeInterval
     * @param c: LocalDateTime
     */
    public TimeInterval(LocalDateTime start, LocalDateTime end)
    {
        this.start = start;
        this.end = end;
    }

    public LocalDateTime getStartTime() {
        return start;
    }

    public LocalDateTime getEndTime() {
        return end;
    }
}
