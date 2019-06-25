package behavioral.mediator;

public class LightReceiver {
    private boolean isOn;
    private String location;

    public LightReceiver() {
    }

    public LightReceiver(String location) {
        this.location = location;
    }

    public boolean isOn() {
        return isOn;
    }

    public void on() {
        System.out.println(location + " switched on");
    }

    public void off() {
        System.err.println(location + " switch off");
    }

    public void toggle() {
        if (isOn) {
            off();
            isOn = false;
        } else {
            on();
            isOn = true;
        }
    }
}
