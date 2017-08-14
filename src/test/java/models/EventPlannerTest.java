package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EventPlannerTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addEvent_getEventOutputInString_String(){
        EventPlanner testEventPlanner = new EventPlanner();
        String testOutput = testEventPlanner.addEvent("Test", 1, 1, 1, 1, 1);
        assertTrue(testOutput instanceof String);
    }

    @Test
    public void listMeals_getMealsDetailsInString_String(){
        EventPlanner testEventPlanner = new EventPlanner();
        String testOutput = testEventPlanner.listMeals();
        assertTrue(testOutput instanceof String);
    }

    @Test
    public void listBeverages_getBeverageDetailsInString_String(){
        EventPlanner testEventPlanner = new EventPlanner();
        String testOutput = testEventPlanner.listBeverages();
        assertTrue(testOutput instanceof String);
    }

    @Test
    public void listEntertainment_getEntertainmentDetailsInString_String(){
        EventPlanner testEventPlanner = new EventPlanner();
        String testOutput = testEventPlanner.listEntertainment();
        assertTrue(testOutput instanceof String);
    }

    @Test
    public void listEventDetails_getEventDetailsInString_String(){
        EventPlanner testEventPlanner = new EventPlanner();
        Event testEvent = new Event(1,1,1,1,1);
        String testOutput = testEventPlanner.listEventDetails(testEvent);
        assertTrue(testOutput instanceof String);
    }

    @Test
    public void listEventNames_getEventNamesInString_String(){
        EventPlanner testEventPlanner = new EventPlanner();
        String testOutput = testEventPlanner.listEventNames();
        assertTrue(testOutput instanceof String);
    }

    @Test
    public void showEvent_getEventDeatailsInString_String(){
        EventPlanner testEventPlanner = new EventPlanner();
        String testEventName = testEventPlanner.addEvent("Test", 1, 1, 1, 1, 1);
        String testOutput = testEventPlanner.showEvent(testEventName);
        assertTrue(testOutput instanceof String);
    }

}