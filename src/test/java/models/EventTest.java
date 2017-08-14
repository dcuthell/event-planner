package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class EventTest {

    @Test
    public void getPartySizeMultiplier_getDoubleForInteger_Double(){
        Event testEvent = setupEvent();
        Integer testInteger = 1;
        assertTrue(testEvent.getPartySizeMultiplier(testInteger) instanceof Double);
    }

    @Test
    public void getGuestCost_getDouble_Double(){
        Event testEvent = setupEvent();
        assertTrue(testEvent.getGuestCost() instanceof Double);
    }

    @Test
    public void getMealCost_getDoubleWithIntegerInput_Double(){
        Event testEvent = setupEvent();
        Integer input = 1;
        assertTrue(testEvent.getMealCost(input) instanceof Double);
    }

    @Test
    public void getBeverageCost_getDoubleWithIntegerInput_Double(){
        Event testEvent = setupEvent();
        Integer input = 1;
        assertTrue(testEvent.getBeverageCost(input) instanceof Double);
    }

    @Test
    public void getEntertainmentCost_getDoubleWithIntegerInput_Double(){
        Event testEvent = setupEvent();
        Integer input = 1;
        assertTrue(testEvent.getEntertainmentCost(input) instanceof Double);
    }

    @Test
    public void getDiscountMultiplier_getDoubleWithIntegerInput_Double(){
        Event testEvent = setupEvent();
        Integer input = 1;
        assertTrue(testEvent.getDiscountMultiplier(input) instanceof Double);
    }

    @Test
    public void getTotalCost_getDouble_Double(){
        Event testEvent = setupEvent();
        assertTrue(testEvent.getTotalCost() instanceof Double);
    }

    public Event setupEvent(){
        return new Event(1,1,1,1,1);
    }
}