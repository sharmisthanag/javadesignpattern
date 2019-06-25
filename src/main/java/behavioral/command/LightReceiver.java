package behavioral.command;

public class LightReceiver {
    boolean isOn;
    public void on(){
        System.out.println("now on");
    }
    public void off(){
        System.out.println("now off");
    }

    public void toggle() {
        if (isOn){
            off();isOn=false;
        }
        else{
            on();isOn=true;
        }
    }
}
