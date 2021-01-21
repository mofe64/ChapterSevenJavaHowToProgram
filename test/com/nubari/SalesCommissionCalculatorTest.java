package com.nubari;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalesCommissionCalculatorTest {
    SalesCommissionCalculator salesCommissionCalculator;

    @BeforeEach
    void setUp() {
        salesCommissionCalculator = new SalesCommissionCalculator();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testGetDistribution() {
        int[] salaries = {100_000, 300, 400, 200, 650, 900, 200};
        int[] distribution = salesCommissionCalculator.getDistribution(salaries);
        assertEquals(2, distribution[2]);
        assertEquals(1, distribution[3]);
        assertEquals(1, distribution[4]);
        assertEquals(0, distribution[5]);
        assertEquals(1, distribution[6]);
    }
}