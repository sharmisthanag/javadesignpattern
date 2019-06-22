package structural.proxy;

import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

import java.util.List;

public class TwitterServiceImpl implements TwitterService {
    private static final String TWITTER_CONSUMER_KEY = "";
    private static final String TWITTER_SECRET_KEY = "";
    private static final String TWITTER_ACCESS_TOKEN = "";
    private static final String TWITTER_ACCESS_TOKEN_SECRET = "";

    @Override
    public String getTimeLine(String screenName) {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthAccessToken(TWITTER_ACCESS_TOKEN)
                .setOAuthAccessTokenSecret(TWITTER_ACCESS_TOKEN_SECRET)
                .setOAuthConsumerKey(TWITTER_CONSUMER_KEY)
                .setOAuthConsumerSecret(TWITTER_SECRET_KEY);
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter tw = tf.getInstance();
        StringBuilder sb = new StringBuilder();
        try {
            Query query = new Query(screenName);
            //query.since("2019-01-21");
            //query.until("2019-04-22");
            query.count(100);
            int i=1;
            QueryResult result;
            do {
                result = tw.search(query);
                List<Status> tweets = result.getTweets();
                for (Status tweet : tweets) {
                    System.out.println("@" + tweet.getUser().getScreenName() + " - "
                            +tweet.getCreatedAt().toString()+"-"+ tweet.getText()+"  "+i);
                    i++;


                }


            } while ((query = result.nextQuery()) != null);
            System.out.println("END");
            System.exit(0);

        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to search tweets: " + te.getMessage());
            System.exit(-1);
        }
        return sb.toString();
    }

    @Override
    public void postInTimeLine(String screenName, String message) {

    }
}
