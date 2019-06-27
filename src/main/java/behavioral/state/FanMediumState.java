package behavioral.state;

public class FanMediumState extends FanState {
    public FanMediumState(Fan_Good fan_good) {
        super(fan_good);
    }

    @Override
    public void handle() {
        getFan_good().setCurrentState(getFan_good().getFanHighState());
        System.out.println("Settling it high");
    }

    @Override
    public String toString() {
        return "Fan is medium";
    }
}
