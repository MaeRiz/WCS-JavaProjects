import java.util.*;

public class Customer {
    public String name;
    public List<Trip> reservations;

    public Customer(String name) {
        this.name = name;
        this.reservations = new ArrayList<>();
    }

    public void reserveTrip(Trip trip) {
        if (trip.reserve(1)) {
            reservations.add(trip);
        } else {
            System.out.println("No seats available for " + trip.getDestination());
        }
    }

    public void listReservations() {
        if (reservations.isEmpty()) {
            System.out.println("No reservations yet.");
        } else {
            for (Trip trip : reservations) {
                System.out.println(trip.getDetails());
            }
        }
    }
}