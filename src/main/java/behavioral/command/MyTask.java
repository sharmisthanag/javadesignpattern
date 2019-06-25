package behavioral.command;

public class MyTask implements Runnable {
    private int i1;
    private int i2;

    public MyTask(int i1, int i2) {
        this.i1 = i1;
        this.i2 = i2;
    }

    @Override
    public void run() {
        System.out.println("add+" +(i1+i2));
    }
}
