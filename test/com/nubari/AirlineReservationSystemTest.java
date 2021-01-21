package com.nubari;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirlineReservationSystemTest {
    AirlineReservationSystem airlineReservationSystem;

    @BeforeEach
    void setUp() {
        airlineReservationSystem = new AirlineReservationSystem();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void assignSeat() {
        assertEquals(AirlineReservationSystem.status.RESERVED, airlineReservationSystem.assignSeatInASection(1));
        assertEquals(AirlineReservationSystem.status.RESERVED, airlineReservationSystem.assignSeatInASection(1));
        assertEquals(AirlineReservationSystem.status.RESERVED, airlineReservationSystem.assignSeatInASection(1));
        assertEquals(AirlineReservationSystem.status.RESERVED, airlineReservationSystem.assignSeatInASection(1));
        assertEquals(AirlineReservationSystem.status.RESERVED, airlineReservationSystem.assignSeatInASection(1));
        assertEquals(AirlineReservationSystem.status.FULL, airlineReservationSystem.assignSeatInASection(1));
        System.out.println(airlineReservationSystem.assignSeatInASection(1));
        assertEquals(AirlineReservationSystem.status.RESERVED, airlineReservationSystem.assignSeatInASection(2));
        assertEquals(AirlineReservationSystem.status.RESERVED, airlineReservationSystem.assignSeatInASection(2));
        assertEquals(AirlineReservationSystem.status.RESERVED, airlineReservationSystem.assignSeatInASection(2));
        assertEquals(AirlineReservationSystem.status.RESERVED, airlineReservationSystem.assignSeatInASection(2));
        assertEquals(AirlineReservationSystem.status.RESERVED, airlineReservationSystem.assignSeatInASection(2));
        assertEquals(AirlineReservationSystem.status.FULL, airlineReservationSystem.assignSeatInASection(2));


    }



    @Test
    void getSeatFullMessage() {
        assertEquals("Next flight leaves in 3 hours", airlineReservationSystem.getSeatFullMessage());
    }
}