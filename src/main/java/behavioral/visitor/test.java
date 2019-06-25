package behavioral.visitor;

public class test {
    public static void main(String[] args) {
        PartOrder partOrder=new PartOrder();
        partOrder.addOrder(new Wheel());
        partOrder.addOrder(new Fender());
        partOrder.addOrder(new Oil());
        System.out.println(partOrder.accept(new AtvVisitorConcrete() {
        }));
    }
}
