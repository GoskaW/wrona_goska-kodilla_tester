package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlightFinderTestSuite {

    @Test
    void findFlightsFrom() {
        List<Flight> result = FlightFinder.findFlightsFrom("Warszawa");
        assertEquals(FlightRepository.getFlightsTable(), result);
    }
                                                                        // nie jestem przekonana, co do skuteczności testów. Mam wrażenie, że czegoś tu brakuje.
    @Test
    void findFlightsTo() {
        List<Flight> result = FlightFinder.findFlightsTo("Kraków");
        assertEquals(FlightRepository.getFlightsTable(), result);

    }
}