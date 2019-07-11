package behavioral.observer;
//Observer
public abstract class MyObserver {
    protected Subject subject;

    public MyObserver(Subject subject) {
        this.subject = subject;
    }

    abstract void update() ;
}
