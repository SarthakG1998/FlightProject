package com.test.project;

public class FlightBookingSystem {
	
	public static void main(String[] args) {
        // Create an instance of AdminPanel
        AdminPanel adminPanel = new AdminPanel();

        // Add flights
        adminPanel.addFlight("FL001", "Mumbai", "Dehli", 100);
        adminPanel.addFlight("FL002", "Banglore", "Lucknow", 80);

        // Update flight details
        adminPanel.updateFlight("FL001", "Dehli", "Chennai", 100);

        // Delete a flight
        adminPanel.deleteFlight("FL002");

        // Get booking records
        adminPanel.getBookingRecords();

        // Create a new user
        User user1 = new User("user1", "password1");

        // Book a flight for user1
        user1.bookFlight("FL001");

        // Display booked flights for user1
        user1.displayBookedFlights();

        // Create another user
        User user2 = new User("user2", "password2");

        // Book a flight for user2
        user2.bookFlight("FL001");

        // Display booked flights for user2
        user2.displayBookedFlights();
    }
}


