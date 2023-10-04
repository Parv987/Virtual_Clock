import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyWindow extends JFrame {
    private JLabel heading;
    private JLabel clockLable;
    private Font font = new Font("",Font.BOLD,35);
    MyWindow(){
        super.setTitle("My Clock");
        super.setSize(400,400);
        super.setLocation(300,50);
        this.createGUI();
        this.staryClock();
        super.setVisible(true);
    }
    public void createGUI(){
        heading = new JLabel("My Clock");
        clockLable = new JLabel("clock");
        heading.setFont(font);
        clockLable.setFont(font);


        this.setLayout(new GridLayout(2 ,1));
        this.add(heading);
        this.add(clockLable);
    }
    public void staryClock(){

    Timer timer=new Timer(1000, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
           String dateTime = new Date().toString();
      // String dateTime=new Date().toLocaleString();
            Date d = new Date();
            SimpleDateFormat sfd=new SimpleDateFormat("hh : mm : ss a");
        //    String dateTime=sfd.format(d);
        clockLable.setText(dateTime);
        }
    });
    timer.start();

   /*
    Thread t =new Thread(){

        public void run(){
            try{
                while(true){
                    Date d = new Date();
                    SimpleDateFormat sfd=new SimpleDateFormat("hh : mm : ss a");
                    String dateTime=sfd.format(d);
                    clockLable.setText(dateTime);
                 //   Thread.sleep(1000);
                    Thread.currentThread().sleep(1000);
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    };
    t.start();

    */

    }
}
