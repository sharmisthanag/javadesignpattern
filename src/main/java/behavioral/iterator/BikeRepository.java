package behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class BikeRepository implements Iterable<String> {
    private int index;
    String[] bikes;

    public BikeRepository() {
        this.bikes = new String[30];
        index = 0;
    }

    public void addBike(String bike) {
        if (index == bikes.length) {
            String[] largerBikes = new String[bikes.length * 2];
            System.arraycopy(bikes, 0, largerBikes, 0, largerBikes.length);
            bikes = largerBikes;
        }
        bikes[index++] = bike;
    }

    @Override
    public Iterator<String> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<String> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < bikes.length && bikes[currentIndex] != null;
        }

        @Override
        public String next() {
            return bikes[currentIndex++];
        }

        @Override
        public void remove() {

        }
    }
}
