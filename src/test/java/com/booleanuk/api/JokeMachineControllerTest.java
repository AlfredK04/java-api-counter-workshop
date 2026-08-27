package com.booleanuk.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JokeMachineControllerTest {

    @Test
    void testGetJoke() {
        JokeMachineController joke = new JokeMachineController();
        
        Assertions.assertEquals(
            "What sort of car does an egg drive? - A yolkswagen!!!",
            joke.getJoke()
        );
    }
}