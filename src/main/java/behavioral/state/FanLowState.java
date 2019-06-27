package behavioral.state;

public class FanLowState extends FanState {
    public FanLowState(Fan_Good fan_good) {
        super(fan_good);
    }

    @Override
    public void handle() {
        getFan_good().setCurrentState(getFan_good().getFanMediumState());
        System.out.println("Settling it medium");
    }

    @Override
    public String toString() {
        return "Fan is low";
    }
}
