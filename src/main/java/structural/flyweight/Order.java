package structural.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order {
    List<Item> orderItemList = new ArrayList<>();
    int orderNumber;

    public Order(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Order addItem(Item item){
        this.orderItemList.add(item);
        return this;
    }

    public Order removeItem(Item item){
        this.orderItemList.remove(item);
        return this;
    }

    public List<Item> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<Item> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return getOrderNumber() == order.getOrderNumber() ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOrderNumber());
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderItemList=" + orderItemList +
                ", orderNumber=" + orderNumber +
                '}';
    }
}
