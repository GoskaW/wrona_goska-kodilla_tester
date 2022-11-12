package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsTable() {
        List<Flight> flightsTable = new ArrayList<>();
        flightsTable.add(new Flight("Londyn", "Kraków"));
        flightsTable.add(new Flight("Kraków", "Londyn"));
        flightsTable.add(new Flight("Katowice", "Nicea"));
        flightsTable.add(new Flight("Nicea", "Katowice"));
        flightsTable.add(new Flight("Boston", "NYC"));

        return flightsTable;


    }


    }
