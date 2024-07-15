import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.*;



public class MyFrame extends JFrame {
    Calendar calendar;

    SimpleDateFormat timeFormat;
    SimpleDateFormat dateFormat;
    SimpleDateFormat dayFormat;

    JLabel timeLabel;
    JLabel dateLabel;
    JLabel dayLabel;

    String time;
    String date;
    String day;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("mrxapem.com");
        this.setLayout(new FlowLayout());
        this.setSize(370,245);
        this.setResizable(false);

        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        dateFormat = new SimpleDateFormat("dd MMMM yyyy");
        dayFormat = new SimpleDateFormat("EEEE");



        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Roboto", Font.PLAIN, 60));


        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Ink Free", Font.PLAIN, 40));

        dayLabel = new JLabel();
        dayLabel.setFont(new Font("Ink Free", Font.PLAIN, 40));


        this.add(timeLabel);
        this.add(dateLabel);
        this.add(dayLabel);

        this.setVisible(true);

        setTime();

    }
    public void setTime(){
        while (true){
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);

            date = dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);

            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);

            try{
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

}
