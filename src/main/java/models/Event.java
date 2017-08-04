package models;

import java.util.HashMap;
import java.util.Map;

public class Event {
    Integer numberOfGuests = 0;
    Integer mealType = 0;
    Integer beverageType = 0;
    Integer entertainmentType = 0;
    Integer discountType = 0;

    Map<Integer, Double> partySizeMultiplier = new HashMap();
    Map<Integer, Double> mealCost = new HashMap();
    Map<Integer, Double> beverageCost = new HashMap();
    Map<Integer, Double> entertainmentCost = new HashMap();
    Map<Integer, Double> discountMultiplier = new HashMap();




    public Event(Integer numberOfGuests, Integer mealType, Integer beverageType, Integer entertainmentType, Integer discountType){
        this.numberOfGuests = numberOfGuests;
        this.mealType = mealType;
        this.beverageType = beverageType;
        this.entertainmentType = entertainmentType;
        this.discountType = discountType;

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
        entertainmentCost.put(1, 5.00);
        entertainmentCost.put(2, 8.00);
        entertainmentCost.put(3, 13.00);
        entertainmentCost.put(4, 21.00);
        entertainmentCost.put(5, 34.00);
        entertainmentCost.put(6, 55.00);
        discountMultiplier.put(0, 1.00);
        discountMultiplier.put(1, .95);
        discountMultiplier.put(2, .90);
        discountMultiplier.put(3, .85);
        discountMultiplier.put(4, .80);
        discountMultiplier.put(5, .75);

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

    public Double getEntertainmentCost(Integer entertainmentType){
        return this.getGuestCost()*entertainmentCost.get(entertainmentType);
    }

    public Double getDiscountMultiplier(Integer discountType){
        return this.getGuestCost()*discountMultiplier.get(discountType);
    }

    public Double getTotalCost(){
        return (this.getMealCost(this.mealType) + this.getBeverageCost(this.beverageType) + this.getEntertainmentCost(this.entertainmentType)) * this.getDiscountMultiplier(this.discountType);
    }










}
