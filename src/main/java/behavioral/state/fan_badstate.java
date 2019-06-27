package behavioral.state;


public class fan_badstate {
    int OFF=0;
    int LOW=1;
    int MEDIUM=2;

    int state=OFF;
    public void pullChain(){
        if (state==OFF){
            System.out.println("turning fan_badstate on to low");
            state=LOW;
        }
        else if (state == LOW){
            System.out.println("turning fan_badstate on to medium");
            state=MEDIUM;
        }
        else if (state == MEDIUM){
            System.out.println("turning fan_badstate off");
            state=OFF;
        }
    }

    @Override
    public String toString() {
        return "fan_badstate{" +
                "state=" + ((state==OFF)?"OFF":(state==LOW)?"LOW":"MEDIUM") +
                '}';
    }
}
