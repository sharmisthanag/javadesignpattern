package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class ItemRegistry {
    private Map<ItemType,Item> itemMap = new HashMap<>();
    public ItemRegistry(){
        this.loadItems();
    }

    public Item getItemByType(ItemType itemType){
        try {
            return (Item) itemMap.get(itemType).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        throw new RuntimeException("Invalid ItemType to gte cloned") ;
    }

    private void loadItems() {
        BookItem bookItem = new BookItem();
        bookItem.setTitle("Basic Book");bookItem.setPrice(100);
        bookItem.setUrl("www.book.com");bookItem.setNumberOfPages(100);
        itemMap.put(ItemType.BOOK,bookItem);
        MovieItem movieItem = new MovieItem();
        movieItem.setTitle("Basic Movie");movieItem.setPrice(350);
        movieItem.setUrl("www.movie.com");movieItem.setRuntime("2.5hrs");
        itemMap.put(ItemType.MOVIE,movieItem);
    }
}
