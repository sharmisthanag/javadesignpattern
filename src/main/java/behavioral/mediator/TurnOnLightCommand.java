package behavioral.mediator;

public class TurnOnLightCommand implements Command {
    Mediator mediator;
    public TurnOnLightCommand(Mediator mediator) {
        this.mediator=mediator;
    }

    @Override
    public void execute() {
        mediator.turnOnAllLights();
    }
}
