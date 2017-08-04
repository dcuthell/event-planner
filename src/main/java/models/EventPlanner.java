package models;

import java.util.ArrayList;

public class EventPlanner {
    ArrayList<Event> allEvents = new ArrayList<>();

    public void addEvent(Integer numberOfGuests, Integer mealType, Integer beverageType, Integer entertainmentType, Integer discountType){
        allEvents.add(new Event(numberOfGuests, mealType, beverageType, entertainmentType, discountType));
    }


}
