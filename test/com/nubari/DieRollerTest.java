package com.nubari;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DieRollerTest {
    DieRoller dieRoller;
    @BeforeEach
    void setUp() {
        dieRoller = new DieRoller(2);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void rollDice() {
        assertEquals(2, dieRoller.rollDice().size());
    }
}