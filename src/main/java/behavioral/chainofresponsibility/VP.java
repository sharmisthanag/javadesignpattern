package behavioral.chainofresponsibility;

import java.math.BigDecimal;

public class VP extends Handler {
    @Override
    public void handleRequest(Request request ) {
        if (request.getAmount().compareTo(new BigDecimal(10000)) <1){
            System.out.println("VP approve equal or below 10000");
        }
        else{
            successor.handleRequest(request);
        }
    }
}
