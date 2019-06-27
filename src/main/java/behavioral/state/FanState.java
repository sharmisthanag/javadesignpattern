package behavioral.state;

public abstract class FanState {
    private Fan_Good fan_good;
    public FanState(Fan_Good fan_good){
        this.fan_good = fan_good;
    }

    public Fan_Good getFan_good() {
        return fan_good;
    }

    public abstract void handle();


    public abstract String toString() ;
}
