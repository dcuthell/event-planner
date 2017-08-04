package models;

import java.util.HashMap;
import java.util.Map;

public class Event {
    Map<Integer, Integer> partySizeMultiplier = new HashMap();

    public Event(){
        partySizeMultiplier.put(1, 1);
    }

    public Integer getPartySizeMultiplier(Integer input){
        return partySizeMultiplier.get(input);
    }
}
