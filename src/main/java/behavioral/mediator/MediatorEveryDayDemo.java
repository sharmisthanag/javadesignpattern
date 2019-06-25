package behavioral.mediator;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class MediatorEveryDayDemo {
    private Timer timer;
    public MediatorEveryDayDemo(int i) {
        timer= new Timer();
        timer.schedule(new RemindTask(),i*1000);
        timer.schedule(new RemindTaskWithoutBeep(),i*1000*2);
    }
    class RemindTask extends TimerTask {
        public void run(){
            System.out.println("Times's up");
            Toolkit.getDefaultToolkit().beep();
        }
    }
    class RemindTaskWithoutBeep extends TimerTask{
        public void run(){
            System.out.println("Now Times's really up");
            timer.cancel();
        }
    }


    public static void main(String[] args) {
        System.out.println("About to schedule a task");
        new MediatorEveryDayDemo(3);
        System.out.println("Task scheduled");
    }
}
