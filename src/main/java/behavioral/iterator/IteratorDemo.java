package behavioral.iterator;

import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        BikeRepository bikeRepository=new BikeRepository();
        bikeRepository.addBike("Chevrolet");
        bikeRepository.addBike("Scott");
        bikeRepository.addBike("Ford");
        Iterator<String> bikeRepositoryIterator = bikeRepository.iterator();
        while(bikeRepositoryIterator.hasNext()){
            System.out.println(bikeRepositoryIterator.next());
        }
    }
}
