package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Catalog {
    Map<String,Item> itemCache = new HashMap<>();
    public Item lookUp(String itemName){
        itemCache.compute(itemName,(key,oldValue)-> oldValue!=null?oldValue:new Item(key));
        return itemCache.get(itemName);
    }
    public int totalItems(){
        return itemCache.size();
    }
}
