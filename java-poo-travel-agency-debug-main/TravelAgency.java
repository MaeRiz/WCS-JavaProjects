import java.util.*;

public class TravelAgency {
    public List<Trip> trips;
    public List<Customer> customers;

    public TravelAgency() {
        this.trips = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    public void addTrip(Trip trip) {
        trips.add(trip);
    }

    public void registerCustomer(Customer customer) {
        customers.add(customer);
    }

    public void listTrips() {
        for (Trip trip : trips) {
            System.out.println(trip.getDetails());
        }
    }

    public static void main(String[] args) {
        TravelAgency agency = new TravelAgency();

        Trip flight = new FlightTrip("Paris", 200.0, 100, "Air France", true);
        Trip cruise = new CruiseTrip("Caribbean", 500.0, 50, 20, true);
        Trip roadTrip = new RoadTrip("Grand Canyon", 300.0, 10, 5, true);

        agency.addTrip(flight);
        agency.addTrip(cruise);
        agency.addTrip(roadTrip);

        Customer john = new Customer("John Doe");
        agency.registerCustomer(john);

        System.out.println("Available Trips:");
        agency.listTrips();

        john.reserveTrip(flight);
        System.out.println("John's reservations: ");
        john.listReservations();
    }
}