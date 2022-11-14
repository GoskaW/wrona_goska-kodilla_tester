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
        Flight flight = new Flight("", "");
        flight.addFlightTo("Kraków");
        flight.addFlightTo("Katowice");
        flight.addFlightTo("Londyn");

        List<Flight> result = FlightFinder.findFlightsTo("Kraków");

        List<Flight> expected = new ArrayList<>();
        expected.add(new Flight("Katowice", "Kraków"));

        assertEquals(expected, result);

    }


    @Test
    public void checkIfFlightFromExist() {
        FlightFinder flightFinder = new FlightFinder();
        flightFinder.findFlightsFrom("Warszawa");
        flightFinder.findFlightsFrom("Katowice");


        List<Flight> result = flightFinder.findFlightsFrom("Warszawa");
        List<Flight> expected = new ArrayList<>();
        expected.add(new Flight("Warszawa", "Kraków"));
        assertEquals(expected,result);





    }
}

