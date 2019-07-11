package behavioral.observer;

public class ObserverTest {
    public static void main(String[] args) {
        Subject subject=new MessageStream();
        MyObserver myObserver=new PhoneClient(subject);
        subject.setState("hello");
    }
}
