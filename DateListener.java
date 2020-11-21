import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class DateListener implements MouseListener {
    private String month;
    private String date;
    private EventPanel ePanel;
    private JLabel label;
    /**
     * constructs a DateListener
     */
    public DateListener(String mnth, String dt, EventPanel ePn, JLabel l)
    {
        this.month = mnth;
        this.date = dt;
        this.ePanel = ePn;
        label = l;
    }
    @Override
    public void mouseClicked(MouseEvent e) {

        Border blackline = BorderFactory.createLineBorder(Color.black);
        label.setBorder(blackline);
        String dates[] = month.split(" ");
        Month newMonth = Month.valueOf(dates[0]);
        LocalDate giveDate = LocalDate.of(Integer.parseInt(dates[1]), newMonth.getValue(), Integer.parseInt(date));
        ePanel.giveDate(giveDate);
        System.out.println(Integer.parseInt(dates[1]) + " " + newMonth.getValue() + " " + Integer.parseInt(date));
    }
    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
