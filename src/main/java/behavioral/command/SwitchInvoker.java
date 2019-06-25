package behavioral.command;

public class SwitchInvoker {
    public void storeAndExecute(Command command){
        command.execute();
    }
}
