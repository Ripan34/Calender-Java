/**
 * a panel class that represent next previous buttons
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel
{
    private CalenderController cController; // calender controller object
    public ButtonPanel(CalenderModel m, EventPanel eP)
    {
        cController = new CalenderController(m);
        JButton next = new JButton(">"); //next button
        next.addActionListener(event-> { cController.getNextDates(); });
        JButton previous = new JButton("<"); //previous button
        previous.addActionListener( event->{cController.getPreviousDates();});
        JButton createEvent = new JButton("Create"); //Create button
        createEvent.addActionListener( event -> {
        eP.cardLayout.show(eP, "createEvent");});
        eP.revalidate();
        add(previous);
        add(next);
        add(createEvent);
    }
}
