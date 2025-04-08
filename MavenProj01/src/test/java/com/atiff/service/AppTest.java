package com.atiff.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testWithPositives() {
    	int a=10;
    	int b=20;
    	int expected = 30;
    	App app = new App();
    	int actual=app.sum(a, b);
        assertEquals(expected,actual);
    }
    @Test
    public void testWithNegatives() {
    	int a=-10;
    	int b=-20;
    	int expected = -30;
    	App app = new App();
    	int actual=app.sum(a, b);
        assertEquals(expected,actual);
    }
    @Test
    public void testWithMixedValues() {
    	int a=10;
    	int b=-20;
    	int expected = -10;
    	App app = new App();
    	int actual=app.sum(a, b);
        assertEquals(expected,actual);
    }
}
