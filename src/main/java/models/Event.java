package models;

import java.util.HashMap;
import java.util.Map;

public class Event {
    Map<Integer, Double> partySizeMultiplier = new HashMap();

    Integer numberOfGuests;

    public Event(){
        partySizeMultiplier.put(1, 1.25);
        partySizeMultiplier.put(2, 1.0);
        partySizeMultiplier.put(3, 0.8);
    }

    //Getters and Setters
    public Double getPartySizeMultiplier(Integer input){
        return partySizeMultiplier.get(input);
    }

    public Integer getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(Integer numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public Double getGuestCost(){
        Double guestCost = 0.00;
        Integer partySize = 0;
        if(numberOfGuests <= 21){
            partySize = 1;
        }else if(numberOfGuests <= 55){
            partySize = 2;
        }else{
            partySize = 3;
        }
        guestCost += numberOfGuests*this.getPartySizeMultiplier(partySize);
        return guestCost;
    }


}
