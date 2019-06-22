package structural.proxy;

public class TwitterDemo {
    public static void main(String[] args) {
        //TwitterService twitterServiceStub = (TwitterService) SecurityProxy.newInstance(new TwitterServiceStub());
        TwitterService twitterServiceImpl = (TwitterService) SecurityProxy.newInstance(new TwitterServiceImpl());
        System.out.println(twitterServiceImpl.getTimeLine("NagSharmistha"));
    }
}
