package structural.proxy;

public class TwitterServiceStub implements TwitterService {
    @Override
    public String getTimeLine(String screenName) {
        return "hello";
    }

    @Override
    public void postInTimeLine(String screenName, String message) {

    }
}
