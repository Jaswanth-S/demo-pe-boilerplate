package com.stackroute.pesoln;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @Test
    void getWelcomeMessage() {
        //Act
        Sample sample=new Sample();
        //Arrange
        String result = sample.getWelcomeMessage();
        //Assert
        assertNotNull(result);
        assertEquals(result,"Welcome  to PE2");
    }
}