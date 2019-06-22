package structural.flyweight;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class InventorySystem {
    Map<Integer,Order> orderMap=new HashMap<>();

    Catalog c = new Catalog();

    public Order takeOrder(int orderNumber,String itemName) {
        Order order=new Order(orderNumber);
        orderMap.compute(orderNumber,(key,oldValue)->{
            if (oldValue==null){
               Order o = new Order(key); o.addItem(c.lookUp(itemName));return o;
            }
            else{
                oldValue.addItem(c.lookUp(itemName));return oldValue;
            }
        });

        return order;
    }

    public void printAllOrder(){
        System.out.println(orderMap.values());
    }
}
