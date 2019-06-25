package behavioral.command;

public class OnCommand implements Command {
    private LightReceiver lightReceiver;

    public OnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.on();
    }
}
