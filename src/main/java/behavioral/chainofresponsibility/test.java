package behavioral.chainofresponsibility;

import java.math.BigDecimal;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class test {
    private static Logger logger = Logger.getLogger(test.class.getName());
    public static void main(String[] args) {
        logger.setLevel(Level.FINER);
        ConsoleHandler handler=new ConsoleHandler();handler.setLevel(Level.FINER);
        logger.addHandler(handler);

        logger.fine("i am fine");
        logger.finer("i am finer");
        logger.finest("i am finest");

        /*Test*/
        Request request = new Request(RequestType.CLIENTVISIT,new BigDecimal(100000000));
        Handler director=new Director();VP vp = new VP();vp.setSuccessor(new CEO());director.setSuccessor(vp);
        director.handleRequest(request);
    }
}
