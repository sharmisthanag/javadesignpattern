package behavioral.chainofresponsibility;

import java.math.BigDecimal;

public class CEO extends Handler {
    @Override
    public void handleRequest(Request request ) {
        System.out.println("I am the boss");
    }
}
