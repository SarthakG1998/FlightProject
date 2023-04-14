package com.test.project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class AdminPanel {
	
	private Map<String, Flight> flights;

    public AdminPanel() {
        this.flights = new HashMap<>();
    }

    // Add a new flight
    public void addFlight(String flightNumber, String departure, String destination, int seats) {
        Flight flight = new Flight(flightNumber, departure, destination, seats);
        flights.put(flightNumber, flight);
    }

    // Update details of an existing flight
    public void updateFlight(String flightNumber, String departure, String destination, int seats) {
        if (flights.containsKey(flightNumber)) {
            Flight flight = flights.get(flightNumber);
            flight.setDeparture(departure);
            flight.setDestination(destination);
            flight.setSeats(seats);
            System.out.println("Flight details updated successfully.");
        } else {
            System.out.println("Flight not found.");
        }
    }

    // Delete a flight
    public void deleteFlight(String flightNumber) {
        if (flights.containsKey(flightNumber)) {
            flights.remove(flightNumber);
            System.out.println("Flight deleted successfully.");
        } else {
            System.out.println("Flight not found.");
        }
    }

    // Get booking records of all users
    public void getBookingRecords() {
        System.out.println("Booking Records:");
        for (Flight flight : flights.values()) {
            flight.displayBookingRecords();
        }
    }

}
