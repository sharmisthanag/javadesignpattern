package behavioral.observer;

public class PhoneClient extends MyObserver {
    public PhoneClient(Subject subject) {
        super(subject);
        subject.attach(this);
    }
    public void addMessage(){
        subject.setState("message sent to observable (subject) from anywhere");
    }

    @Override
    //after notified
    void update() {
        System.out.println("notified here in proneClient Observer :"+subject.getState());
    }
}
