package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        //Given
        String log = "Ostatnie logowanie";
        //When
        Logger.getInstance().log("Pierwsze logowanie");
        Logger.getInstance().log(log);
        String lastLog = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("Ostatnie logowanie", lastLog);
    }

}
