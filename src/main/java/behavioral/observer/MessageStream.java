package behavioral.observer;

//COncreteSUbject
public class MessageStream extends Subject {
    private String state;

    @Override
    String getState() {
        return this.state;
    }

    @Override
    void setState(String state) {
        this.state = state;
        this.notifyObservers();
    }
}
