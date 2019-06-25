package behavioral.chainofresponsibility;

import java.math.BigDecimal;

public class Director extends Handler {
    @Override
    public void handleRequest(Request request ) {
        if (request.getAmount().compareTo(new BigDecimal(5000)) <1){
            System.out.println("Directors approve equal or below 5000");
        }
        else{
            successor.handleRequest(request);
        }
    }
}
