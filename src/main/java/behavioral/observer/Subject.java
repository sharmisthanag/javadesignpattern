package behavioral.observer;

import java.util.*;
//Observable
public abstract class Subject {
    private List<MyObserver> myObservers = new ArrayList<>();

    abstract String getState();

    abstract void setState(String state);

    public void attach(MyObserver myObserver) {
        myObservers.add(myObserver);
    }

    public void detach(MyObserver myObserver) {
        myObservers.remove(myObserver);
    }

    public void notifyObservers() {
        myObservers.forEach(observer -> observer.update());
    }

}
