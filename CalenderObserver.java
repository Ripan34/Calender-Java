/**
 * Observer server class for calender panel
 */
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class CalenderObserver extends JFrame implements Observer{
    private ArrayList<String> dates;
    private CalenderPanel cPanel; //calender panel
    private JPanel bPanel; //button panel
    private CalenderModel dataModel; //model
    private LocalDateTime now; //date object
    private EventPanel eventPanel;
    /**
     * constructs a Calender Observer object
     */
    public CalenderObserver(CalenderModel m)
    {
        dataModel = m;
        dates = new ArrayList<String>();
        now = LocalDateTime.now();
        dates.add(now.getMonth().name() + " " + now.getYear());
        now = now.withDayOfMonth(1);
        dates.add(now.getDayOfWeek().name());
        for(int i = 1; i <= now.toLocalDate().lengthOfMonth(); i++)
        {
            dates.add(String.valueOf(i));
        }
        eventPanel =  new EventPanel();
        bPanel = new ButtonPanel(dataModel, eventPanel);
        visualize();
    }
    /**
     * to visualize the frame
     */
    public void visualize()
    {
        Border blackline = BorderFactory.createLineBorder(Color.black);
        Border redLine = BorderFactory.createLineBorder(Color.red);
        eventPanel.setPreferredSize(new Dimension(300, 100));
        eventPanel.setBorder(redLine);
        cPanel = new CalenderPanel(dates, eventPanel);
        cPanel.setPreferredSize(new Dimension(300, 100));
        cPanel.setBorder(blackline);
        JPanel labelsPanel = new JPanel();
        labelsPanel.add(new JLabel(dates.get(0)));
        labelsPanel.add(new JLabel("                                                                     "));
        labelsPanel.add(new JLabel("Events"));
        add(labelsPanel, BorderLayout.PAGE_START);
        add(cPanel, BorderLayout.LINE_START);
        add(bPanel, BorderLayout.PAGE_END);

        add(eventPanel, BorderLayout.LINE_END);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700,500);
        setVisible(true);
    }

    @Override
    public void notifyData() {
    dates = (ArrayList<String>) dataModel.getData().clone();
    cPanel.notifyCalenderPanel(dates);
    getContentPane().removeAll();
    visualize();

    }
}
