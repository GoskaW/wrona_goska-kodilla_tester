package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlightFinderTestSuite {

    @Test
    void findFlightsFrom() {
       List<Flight> result = FlightFinder.findFlightsFrom("Londyn");
       assertEquals(FlightFinder.findFlightsFrom("Londyn"), result);

    }

    @Test
    void findFlightsTo() {
        List<Flight> result = FlightFinder.findFlightsTo("Kraków");
        assertEquals(FlightFinder.findFlightsTo("Kraków"), result);

    }
    @Test
    void checkIfFlightFromExist () {
         List<Flight> expected = new ArrayList<>();
        List<Flight> result = FlightFinder.findFlightsFrom("Warszawa");
        assertEquals(FlightFinder.findFlightsFrom("Warszawa"), result);
            }
        }

