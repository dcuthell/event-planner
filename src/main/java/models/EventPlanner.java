package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EventPlanner {
    ArrayList<Event> allEvents = new ArrayList<>();
    Map<Integer, String> mealDescription = new HashMap();
    Map<Integer, String> beverageDescription = new HashMap();
    Map<Integer, String> entertainmentDescription = new HashMap();

    public EventPlanner(){
        mealDescription.put(1, "Light Snacks");
        mealDescription.put(2, "Hearty Snacks");
        mealDescription.put(3, "Simple Lunch");
        mealDescription.put(4, "Fancy Lunch");
        mealDescription.put(5, "Simple Dinner");
        mealDescription.put(6, "Fancy Dinner");
        beverageDescription.put(1, "Non-Alcoholic Beverages Only");
        beverageDescription.put(2, "Cheap Beer and Well Drinks");
        beverageDescription.put(3, "Craft Brews and Top-Shelf Booze");
        entertainmentDescription.put(1, "Generic Pop Music Playlist on PA System");
        entertainmentDescription.put(2, "Stand-up Comedian");
        entertainmentDescription.put(3, "DJ with Laser Light Show");
        entertainmentDescription.put(4, "Interpretive Dance Troupe");
        entertainmentDescription.put(5, "Grateful Dead Cover Band");
        entertainmentDescription.put(6, "Black-Tie Jazz Band");
    }

    public void addEvent(Integer numberOfGuests, Integer mealType, Integer beverageType, Integer entertainmentType, Integer discountType){
        allEvents.add(new Event(numberOfGuests, mealType, beverageType, entertainmentType, discountType));
    }

    public String listMeals(){
        String output = "";
        for(int i = 1; i <= 6; i++){
            output += i + "  -  " + mealDescription.get(i) + "\n";
        }
        return output;
    }

    public String listBeverages(){
        String output = "";
        for(int i = 1; i <= 3; i++){
            output += i + "  -  " + beverageDescription.get(i) + "\n";
        }
        return output;
    }

    public String listEntertainment(){
        String output = "";
        for(int i = 1; i <= 6; i++){
            output += i + "  -  " + entertainmentDescription.get(i) + "\n";
        }
        return output;
    }

}
