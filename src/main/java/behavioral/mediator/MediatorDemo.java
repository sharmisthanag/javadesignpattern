package behavioral.mediator;

public class MediatorDemo {
    public static void main(String[] args) {
        Mediator mediator=new Mediator();
        LightReceiver bedRoom=new LightReceiver("Bedroom");
        LightReceiver kitchen=new LightReceiver("Kitchen");
        mediator.registerLight(bedRoom);
        mediator.registerLight(kitchen);
        Command turnOnLightCommand=new TurnOnLightCommand(mediator);
        turnOnLightCommand.execute();
    }
}
