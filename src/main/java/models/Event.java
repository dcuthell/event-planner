package models;

import java.util.HashMap;
import java.util.Map;

public class Event {
    Map<Integer, Double> partySizeMultiplier = new HashMap();

    public Event(){
        partySizeMultiplier.put(1, 1.25);
        partySizeMultiplier.put(2, 1.0);
        partySizeMultiplier.put(3, 0.8);
    }

    public Double getPartySizeMultiplier(Integer input){
        return partySizeMultiplier.get(input);
    }
}
