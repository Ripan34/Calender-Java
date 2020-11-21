/**
 * a panel for events
 */

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class EventPanel extends JPanel {
    private ArrayList<Event> events;
    private JPanel showEventPanel;
    private JPanel createEventPanel;
    CardLayout cardLayout;
    private LocalDate setEventDate;

    /**
     * constructs an eventPanel object
     */
    public EventPanel()
    {
        setEventDate = LocalDate.now();
        cardLayout = new CardLayout();
        setLayout(cardLayout);
        showEventPanel = new JPanel();
        createEventPanel = new JPanel();
        events = new ArrayList<>();
        JTextField name = new JTextField();
        name.setPreferredSize(new Dimension(340, 30));
        createEventPanel.add(name);
        JTextField start = new JTextField();
        JButton save = new JButton("SAVE"); //to save event
        start.setPreferredSize(new Dimension(50,25));
        JTextField end = new JTextField();
        end.setPreferredSize(new Dimension(50,25));
        createEventPanel.add(start);
        createEventPanel.add(new JLabel("to"));
        createEventPanel.add(end);
        createEventPanel.add(save); //to save event
        if(events.size() == 0)
            showEventPanel.add(new JLabel("No events"));
        for(Event e: events)
        {
            showEventPanel.add(new JLabel(e.getEventName() + "\n" + e.getTimeInterval().getStartTime() + "to" + e.getTimeInterval().getEndTime()));
        }
        add(showEventPanel, "showEvent");
        add(createEventPanel, "createEvent");
        save.addActionListener(event -> {
            int h = Integer.parseInt(start.getText().split(":")[0]);
            int m = Integer.parseInt(start.getText().split(":")[1]);
            LocalTime l = LocalTime.of(h, m);
             LocalDateTime st = LocalDateTime.of(setEventDate, l); //start date and time
            int hE = Integer.parseInt(end.getText().split(":")[0]);
            int mE = Integer.parseInt(end.getText().split(":")[1]);
            LocalTime l2 = LocalTime.of(hE, mE);
            LocalDateTime en = LocalDateTime.of(setEventDate, l2); //start date and time
            Event newEvent = new Event();
            TimeInterval newInterval = new TimeInterval(st, en);
            newEvent.setEventName(name.getText());
            newEvent.setTimeInterval(newInterval);
            events.add(newEvent);
            showEventPanel.revalidate();
            cardLayout.show(this, "showEvent");
        });
        revalidate();
        repaint();
    }
    /**
     * to set events
     */
    public void giveDate(LocalDate c)
    {
        setEventDate = c;
    }

}
