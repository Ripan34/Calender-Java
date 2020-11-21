/**
 * panel class for calender
 */
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class CalenderPanel extends JPanel{
    private ArrayList<String> dates;
    private EventPanel eventPanel;
    /**
     * constructs a panel calender object
     */
    public CalenderPanel(ArrayList<String> d, EventPanel ePan)
    {
        dates = (ArrayList<String>) d.clone();
        this.eventPanel = ePan;
        String month = dates.get(0);
        dates.remove(0);
        setLayout(new GridLayout(6, 7)); //panel for calender
        add(new JLabel("S"));
        add(new JLabel("M"));
        add(new JLabel("T"));
        add(new JLabel("W"));
        add(new JLabel("T"));
        add(new JLabel("F"));
        add(new JLabel("S"));

        int index = 0;
        switch(dates.get(0)){
                case "SUNDAY":
                index = 0;
                break;
                case "MONDAY":
                index = 1;
                break;
                case "TUESDAY":
                index = 2;
                break;
                case "WEDNESDAY":
                index = 3;
                break;
                case "THURSDAY":
                index = 4;
                break;
                case "FRIDAY":
                index = 5;
                break;
                case "SATURDAY":
                index = 6;
                break;
            default:
                break;
        };
        for(int i = 0; i  < index; i++)
        {
            add(new JLabel(" "));
        }
        dates.remove(0);
        LocalDateTime nowDate = LocalDateTime.now();
        for(String c: dates)
        {
            JLabel label = new JLabel(c);
            if(nowDate.toLocalDate().getDayOfMonth() == Integer.parseInt(c))
                label.setForeground(Color.red);
            label.addMouseListener(new DateListener(month, label.getText(), eventPanel, label));
            add(label);
        }
    }
    /**
     * to get new data
     */
    public void notifyCalenderPanel(ArrayList<String> d)
    {
        this.dates = d;
    }
    /**
     * to setUp panel
     */
    public void setPanel()
    {
        for(String c: dates)
        {
            add(new JLabel(c));
        }
    }

}
