package behavioral.command;

import java.util.List;

public class test {
    public static void main(String[] args) {
        testCommandByJava();
        testCommandCustom();
    }

    private static void testCommandCustom() {
        LightReceiver lightReceiver=new LightReceiver();
        Command command=new ToggleCommand(lightReceiver);
        SwitchInvoker switchInvoker = new SwitchInvoker();
        switchInvoker.storeAndExecute(command);
        switchInvoker.storeAndExecute(command);switchInvoker.storeAndExecute(command);switchInvoker.storeAndExecute(command);
    }

    private static void testCommandByJava() {
        MyTask myTask  =new MyTask(11,10);//this is my concrete command,Runnable is command
        MyTask myTask1  =new MyTask(13,10);
        Thread th1=new Thread(myTask);//this is my invoker and console is y receiver
        Thread th2=new Thread(myTask1);
        th1.start();th2.start();
    }
}
