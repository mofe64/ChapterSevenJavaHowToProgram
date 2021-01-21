package com.nubari;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VariableListSumTest {

    @Test
    void sum() {
        assertEquals(45, VariableListSum.sum(1, 2, 3, 4, 5, 6, 7, 8, 9));
    }
}