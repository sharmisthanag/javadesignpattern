package behavioral.command;

public class ToggleCommand implements Command {
    private LightReceiver lightReceiver;

    public ToggleCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.toggle();
    }
}
