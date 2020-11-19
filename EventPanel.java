/**
 * a panel for events
 */

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class EventPanel extends JPanel {
    private ArrayList<Event> events;
    private JPanel showEventPanel;
    private JPanel createEventPanel;
    CardLayout cardLayout;

    /**
     * constructs an eventPanel object
     */
    public EventPanel()
    {
        cardLayout = new CardLayout();
        setLayout(cardLayout);
        showEventPanel = new JPanel();
        createEventPanel = new JPanel();
        events = new ArrayList<>();
        //add(new JLabel("Events"));
        JTextField name = new JTextField();
        name.setPreferredSize(new Dimension(280, 30));
        // name.setSize(20,5);
        createEventPanel.add(name);
        JTextField start = new JTextField();
        JButton save = new JButton("SAVE"); //to save event
        start.setPreferredSize(new Dimension(50,25));
        JTextField end = new JTextField();
        end.setPreferredSize(new Dimension(50,25));
        createEventPanel.add(start);
        createEventPanel.add(new JLabel("to"));
        createEventPanel.add(end);
        createEventPanel.add(save);
        showEventPanel.add(new JLabel("No events"));
        add(showEventPanel, "showEvent");
        add(createEventPanel, "createEvent");
        revalidate();
        repaint();
    }
    /**
     * to show events
     */
    public void showEvents()
    {

    }
    /**
     * to add events
     */
    public void addEvents()
    {

    }

}
