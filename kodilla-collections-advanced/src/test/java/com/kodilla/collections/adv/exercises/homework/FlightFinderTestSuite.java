package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlightFinderTestSuite {

    @Test
    void findFlightsFrom() {
       List<Flight> result = FlightFinder.findFlightsFrom("Londyn");
       assertEquals(FlightRepository.getFlightsTable(), result);

    }

    @Test
    void findFlightsTo() {
        List<Flight> result = FlightFinder.findFlightsTo("Kraków");
        assertEquals(FlightRepository.getFlightsTable(), result);

    }
    @Test
    void checkIfFlightFromExist () {
        List<Flight> expected = new ArrayList<>();
        List<Flight> result = FlightFinder.findFlightsFrom("Warszawa");
        assertEquals(FlightRepository.getFlightsTable(), result);
            }

            }