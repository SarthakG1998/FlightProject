package com.test.project;

import java.util.ArrayList;
import java.util.List;

public class Flight {
	
	 private String flightNumber;
	    private String departure;
	    private String destination;
	    private int seats;
	    private List<String> bookedUsers;

	    public Flight(String flightNumber, String departure, String destination, int seats) {
	        this.flightNumber = flightNumber;
	        this.departure = departure;
	        this.destination = destination;
	        this.seats = seats;
	        this.bookedUsers = new ArrayList<>();
	    }

	    public void setDeparture(String departure) {
	        this.departure = departure;
	    }

	    public void setDestination(String destination) {
	        this.destination = destination;
	    }

	    public void setSeats(int seats) {
	        this.seats = seats;
	    }

	    public void bookFlight(String username) {
	        if (seats > 0) {
	            bookedUsers.add(username);
	            seats--;
	            System.out.println("Flight booked successfully.");
	        } else {
	            System.out.println("No seats available on this flight.");
	        }
	    }

	    public void displayBookingRecords() {
	        System.out.println("Flight Number: " + flightNumber);
	        System.out.println("Departure: " + departure);
	        System.out.println("Destination: " + destination);
	        System.out.println("Booked Users: " + bookedUsers.toString());
	        System.out.println("Available Seats: " + seats);
	        System.out.println();
	    }

}
