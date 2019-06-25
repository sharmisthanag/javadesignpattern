package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
    private List<LightReceiver> lightReceivers=new ArrayList<>();
    public void registerLight(LightReceiver lightReceiver){
        this.lightReceivers.add(lightReceiver);
    }
    public void turnOnAllLights(){
        lightReceivers.stream()
                .filter(lightReceiver -> !lightReceiver.isOn())
                .forEach(lightReceiver -> lightReceiver.toggle());
    }
}
