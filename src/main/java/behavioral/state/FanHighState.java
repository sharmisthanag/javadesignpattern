package behavioral.state;

public class FanHighState extends FanState {
    public FanHighState(Fan_Good fan_good) {
        super(fan_good);
    }

    @Override
    public void handle() {
        getFan_good().setCurrentState(getFan_good().getFanOffState());
        System.out.println("Settling it off");
    }

    @Override
    public String toString() {
        return "Fan is high";
    }
}
