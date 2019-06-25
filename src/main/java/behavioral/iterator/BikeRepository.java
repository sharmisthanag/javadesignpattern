package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class BikeRepository {
    List<String> bikes=new ArrayList<>();

    public void addBike(String bike){
        bikes.add(bike);
    }
}
