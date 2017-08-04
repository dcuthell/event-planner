package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class EventTest {

    @Test
    public void getPartySizeMultiplier_getDoubleForInteger_Double(){
        Event testEvent = new Event();
        Integer testInteger = 1;
        assertTrue(testEvent.getPartySizeMultiplier(testInteger) instanceof Double);
    }

}