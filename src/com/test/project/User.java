package com.test.project;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private String username;
    private String password;
    private List<String> bookedFlights;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.bookedFlights = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void bookFlight(String flightNumber) {
        bookedFlights.add(flightNumber);
        System.out.println("Flight booked successfully.");
    }

   public void displayBookedFlights() {
    System.out.println("Booked Flights for User: " + username);
    if (bookedFlights.isEmpty()) {
        System.out.println("No flights booked.");
    } else {
        for (String flightNumber : bookedFlights) {
            System.out.println("Flight Number: " + flightNumber);
        }
    }
    System.out.println();

}
}
