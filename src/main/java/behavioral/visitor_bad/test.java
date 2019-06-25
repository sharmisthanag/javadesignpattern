package behavioral.visitor_bad;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        PartOrder partOrder=new PartOrder();
        partOrder.addOrder(new Wheel());
        partOrder.addOrder(new Fender());
        partOrder.addOrder(new Oil());
        System.out.println(partOrder.shippingCost());

        int length = Arrays.asList("one", "two","three","four")
                .parallelStream()
                .reduce(0,
                        (accumulatedInt, str) -> accumulatedInt + str.length(),                 //accumulator
                        (accumulatedInt, accumulatedInt2) -> accumulatedInt + accumulatedInt2); //combiner
        System.out.println(length);
    }
}
