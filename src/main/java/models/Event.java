package models;

import java.util.HashMap;
import java.util.Map;

public class Event {
    Map<Integer, Double> partySizeMultiplier = new HashMap();
    Integer numberOfGuests = 0;
    Map<Integer, Double> mealCost = new HashMap();
    Map<Integer, Double> beverageCost = new HashMap();



    public Event(){
        partySizeMultiplier.put(1, 1.25);
        partySizeMultiplier.put(2, 1.0);
        partySizeMultiplier.put(3, 0.8);
        mealCost.put(1, 5.00);
        mealCost.put(2, 8.00);
        mealCost.put(3, 13.00);
        mealCost.put(4, 21.00);
        mealCost.put(5, 34.00);
        mealCost.put(6, 55.00);
        beverageCost.put(1, 8.00);
        beverageCost.put(2, 21.00);
        beverageCost.put(3, 55.00);

    }

    //Getters and Setters
    public Double getPartySizeMultiplier(Integer input){
        return partySizeMultiplier.get(input);
    }

    public Double getGuestCost(){
        Double guestCost;
        Integer partySize;
        if(numberOfGuests <= 21){
            partySize = 1;
        }else if(numberOfGuests <= 55){
            partySize = 2;
        }else{
            partySize = 3;
        }
        guestCost = numberOfGuests*this.getPartySizeMultiplier(partySize);
        return guestCost;
    }

    public Double getMealCost(Integer mealType){
        return this.getGuestCost()*mealCost.get(mealType);
    }

    public Double getBeverageCost(Integer beverageType){
        return this.getGuestCost()*beverageCost.get(beverageType);
    }










}
