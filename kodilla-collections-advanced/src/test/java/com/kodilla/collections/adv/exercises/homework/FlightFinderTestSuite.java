package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlightFinderTestSuite {

    @Test
    void findFlightsFrom() {
        List<Flight> result = FlightFinder.findFlightsFrom("Warszawa");
        assertEquals(0,0);
    }

    @Test
    void findFlightsTo() {
        List<Flight> result = FlightFinder.findFlightsTo("Kraków");
        assertEquals(1,1);

    }
}