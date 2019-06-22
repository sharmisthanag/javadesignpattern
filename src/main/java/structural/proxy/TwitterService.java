package structural.proxy;

public interface TwitterService {
    String getTimeLine(String screenName);
    void postInTimeLine(String  screenName,String message);
}
