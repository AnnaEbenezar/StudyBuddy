package MenuSystem;

import javax.swing.*;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Timer;

public class ClockDate {
    private int currentSecond;
    public final SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
    public final SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
    private Calendar calendar;
    private final JLabel clockLabel;
    private final JLabel dateLabel;
    private Timer timer;

    public ClockDate(JLabel clockLabel, JLabel dateLabel) {

        this.clockLabel = clockLabel;
        this.dateLabel = dateLabel;
        this.start();
    }

    private void reset() {
        calendar = Calendar.getInstance();
        currentSecond = calendar.get(Calendar.SECOND);
    }

    public void start() {
        reset();
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                if (currentSecond == 60) {
                    reset();
                }
                clockLabel.setText(String.format("%s:%02d", sdf.format(calendar.getTime()), currentSecond));
                dateLabel.setText(dateFormat.format(calendar.getTime()));
                currentSecond++;
            }
        }, 0, 1000);
    }

    public void stop() {
        timer.cancel();
    }
}