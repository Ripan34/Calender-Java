import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DateListener implements MouseListener {
    private String month;
    private String date;
    private EventPanel ePanel;
    /**
     * constructs a DateListener
     */
    public DateListener(String mnth, String dt, EventPanel ePn)
    {
        this.month = mnth;
        this.date = dt;
        this.ePanel = ePn;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        ePanel.removeAll();
        ePanel.addEvents();
        ePanel.revalidate();
        System.out.println(month + " " + date);
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
