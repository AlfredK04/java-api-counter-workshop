package com.booleanuk.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KnockKnockControllerTest {
    
    @Test
    void testFirstLine() {
        KnockKnockController joke = new KnockKnockController();
        Assertions.assertEquals("Knock, knock.", joke.line1(0));
    }

    @Test
    void testLine2() {
        KnockKnockController joke = new KnockKnockController();
        Assertions.assertEquals("Knock, knock.\nWho's there?", joke.line2(0));
    }

    @Test
    void testFull() {
        KnockKnockController joke = new KnockKnockController();
        Assertions.assertEquals("Knock, knock.\nWho's there?\nBoo.\nBoo who?\nDon't cry, it's just a joke!", joke.line5(0));
    }
}
