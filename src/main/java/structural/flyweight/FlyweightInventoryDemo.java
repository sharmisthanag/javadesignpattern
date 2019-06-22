package structural.flyweight;

public class FlyweightInventoryDemo {
    public static void main(String[] args) {
        InventorySystem inventorySystem=new InventorySystem();
        inventorySystem.takeOrder(1,"potato");
        inventorySystem.takeOrder(1,"onion");
        inventorySystem.takeOrder(1,"cucumber");
        inventorySystem.takeOrder(1,"shampoo");
        inventorySystem.takeOrder(1,"lipstick");
        inventorySystem.takeOrder(2,"shampoo");
        inventorySystem.takeOrder(2,"conditioner");
        inventorySystem.takeOrder(2,"garlic");
        inventorySystem.takeOrder(2,"ginger");
        inventorySystem.printAllOrder();
    }
}
