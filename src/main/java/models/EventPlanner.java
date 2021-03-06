package models;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EventPlanner {
    private static DecimalFormat df = new DecimalFormat("#0.00");
//    ArrayList<Event> allEvents = new ArrayList<>();
    Map<String, Event> allEvents = new HashMap<>();
    Map<Integer, String> mealDescription = new HashMap();
    Map<Integer, String> beverageDescription = new HashMap();
    Map<Integer, String> entertainmentDescription = new HashMap();
    Map<Integer, String> discountDescription = new HashMap();
    ArrayList<String> allNames = new ArrayList();

    public EventPlanner(){
        mealDescription.put(1, "Light Snacks");
        mealDescription.put(2, "Hearty Snacks");
        mealDescription.put(3, "Simple Lunch");
        mealDescription.put(4, "Fancy Lunch");
        mealDescription.put(5, "Simple Dinner");
        mealDescription.put(6, "Fancy Dinner");
        beverageDescription.put(1, "Non-Alcoholic Beverages Only :(");
        beverageDescription.put(2, "Cheap Beer, Boxed Wine, and Well Drinks");
        beverageDescription.put(3, "Craft Beers, Champagne, and Top-Shelf Booze");
        entertainmentDescription.put(1, "Generic Pop Music Playlist on PA System");
        entertainmentDescription.put(2, "Stand-up Comedian");
        entertainmentDescription.put(3, "DJ with Laser Light Show");
        entertainmentDescription.put(4, "Interpretive Dance Troupe");
        entertainmentDescription.put(5, "Grateful Dead Cover Band");
        entertainmentDescription.put(6, "Black-Tie Jazz Band");
        discountDescription.put(1, "Standard Rate");
        discountDescription.put(2, "5% Off");
        discountDescription.put(3, "10% Off");
        discountDescription.put(4, "15% Off");
        discountDescription.put(5, "20% Off");
        discountDescription.put(6, "25% Off");
    }

    public String addEvent(String eventName, Integer numberOfGuests, Integer mealType, Integer beverageType, Integer entertainmentType, Integer discountType){
        Event newEvent = new Event(numberOfGuests, mealType, beverageType, entertainmentType, discountType);
        String output = this.listEventDetails(newEvent);
        allNames.add(eventName);
        allEvents.put(eventName, newEvent);
        return output;
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

    public String listEventDetails(Event thisEvent){
        Integer[] detailValues = thisEvent.getEventDetails();
        String eventDetails = "Number of Guests: " + detailValues[0] + "\nMeal Service: " + mealDescription.get(detailValues[1]) + "\nBeverage Service: " + beverageDescription.get(detailValues[2]) + "\nEntertainment: " + entertainmentDescription.get(detailValues[3]) + "\nDiscount Rate: " + discountDescription.get(detailValues[4]) + "\nTotal Event Cost: $" + df.format(Double.valueOf(thisEvent.getTotalCost())) + "\nCost per Guest: $" + df.format(Double.valueOf((thisEvent.getTotalCost()/detailValues[0])));
        return eventDetails;
    }

    public String listEventNames(){
        String output = "";
        for(String oneName: allNames){
            output += oneName + "\n";
        }
        return output;
    }

    public String showEvent(String eventName){
        Event thisEvent = allEvents.get(eventName);
        if(thisEvent == null){
            return "No such event!";
        }else{
            return listEventDetails(thisEvent);
        }

    }
}
