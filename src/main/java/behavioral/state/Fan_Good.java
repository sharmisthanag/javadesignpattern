package behavioral.state;

public class Fan_Good {
    private FanState fanOffState;
    private FanState fanLowState;
    private FanState fanMediumState;
    private FanState fanHighState;
    private FanState currentState;

    public FanState getFanOffState() {
        return fanOffState;
    }

    public void setFanOffState(FanState fanOffState) {
        this.fanOffState = fanOffState;
    }

    public FanState getFanLowState() {
        return fanLowState;
    }

    public void setFanLowState(FanState fanLowState) {
        this.fanLowState = fanLowState;
    }

    public FanState getFanMediumState() {
        return fanMediumState;
    }

    public void setFanMediumState(FanState fanMediumState) {
        this.fanMediumState = fanMediumState;
    }

    public FanState getFanHighState() {
        return fanHighState;
    }

    public void setFanHighState(FanState fanHighState) {
        this.fanHighState = fanHighState;
    }

    public FanState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(FanState currentState) {
        this.currentState = currentState;
    }

    public Fan_Good(){
        fanOffState = new FanOffState(this);
        fanLowState = new FanLowState(this);
        fanMediumState = new FanMediumState(this);
        fanHighState = new FanHighState(this);
        currentState = fanOffState;
    }

    public void pullChain(){
        currentState.handle();
    }

    public String toString(){
        return String.format("Fan_Good current state: {}",currentState.toString());
    }
}
