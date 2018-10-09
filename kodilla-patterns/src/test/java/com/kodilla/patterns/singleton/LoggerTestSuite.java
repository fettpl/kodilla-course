package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetFileName() {
        //Given
        //When
        Logger.getInstance().log("Lorem ipsum dolor");

        //Then
        Assert.assertEquals("Lorem ipsum dolor", Logger.getInstance().getLastLog());
    }
}
