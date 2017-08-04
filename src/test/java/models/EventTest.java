package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class EventTest {

    @Test
    public void getPartySizeMultiplier_getOneForOne_1(){
        Event testEvent = new Event();
        Integer expectedOutput = 1;
        assertEquals(expectedOutput, testEvent.getPartySizeMultiplier(1));
    }

}