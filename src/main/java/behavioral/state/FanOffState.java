package behavioral.state;

public class FanOffState extends FanState {
    public FanOffState(Fan_Good fan_good) {
        super(fan_good);
    }

    @Override
    public void handle() {
        getFan_good().setCurrentState(getFan_good().getFanLowState());
        System.out.println("Settling it to low");
    }

    @Override
    public String toString() {
        return "Fan is off";
    }
}
