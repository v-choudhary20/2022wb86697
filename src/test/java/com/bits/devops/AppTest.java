package com.bits.devops;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testGetMessage() {
        assertEquals(
            "Continuous Build using Maven and Jenkins",
            App.getMessage()
        );
    }
}

