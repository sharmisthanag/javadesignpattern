package creational.prototype;

import java.text.SimpleDateFormat;

public class TestPrototypePattern {
    public static void main(String[] args) {

        ItemRegistry registry = new ItemRegistry();
        long start=System.currentTimeMillis();
        MovieItem movieItem = (MovieItem) registry.getItemByType(ItemType.MOVIE);
        System.out.println("**diff1:"+(System.currentTimeMillis()-start));
        System.out.println(movieItem+"|"+movieItem.getRuntime());

        start=System.currentTimeMillis();
        MovieItem movieItem1 = (MovieItem) registry.getItemByType(ItemType.MOVIE);
        System.out.println("**diff2:"+(System.currentTimeMillis()-start));
        movieItem1.setTitle("More than movie");
        movieItem1.setRuntime("3.5hrs");
        System.out.println(movieItem1+"|"+movieItem1.getRuntime());

        start=System.currentTimeMillis();
        MovieItem movieItem2 = new MovieItem();
        System.out.println("**diff3:"+(System.currentTimeMillis()-start));
        System.out.println(movieItem2+"|"+movieItem2.getRuntime());

        //*********
        SimpleDateFormat sdf  = new SimpleDateFormat("yyyy-MM-dd");
         start = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++){
            SimpleDateFormat localSdf = (SimpleDateFormat)sdf.clone();
        }
        System.out.println("Cloning : " + (System.currentTimeMillis() - start) + " ms");

        start = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++){
            Object localSdf = new SimpleDateFormat("yyyy-MM-dd");
        }
        System.out.println("Creating : " + (System.currentTimeMillis() - start) + " ms");
    }
}
