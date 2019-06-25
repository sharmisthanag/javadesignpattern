package behavioral.chainofresponsibility;

import java.math.BigDecimal;

public class Request {
    private RequestType requestType;
    private BigDecimal amount;

    public Request(RequestType requestType, BigDecimal amount) {
        this.requestType = requestType;
        this.amount = amount;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
