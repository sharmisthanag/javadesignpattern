package behavioral.visitor_bad;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PartOrder implements AtvPart {
    List<AtvPart> parts=new ArrayList<>();

    public void addOrder(AtvPart atvPart){
        parts.add(atvPart);
    }
    @Override
    public double shippingCost() {
        return parts.stream().collect(Collectors.summingDouble(AtvPart::shippingCost));
    }
}
