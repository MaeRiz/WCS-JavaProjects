public class FlightTrip extends Trip {
    public String airline;
    public boolean isInternational;

    public FlightTrip(String destination, double price, int availableSeats, String airline, boolean isInternational) {
        super(destination, price, availableSeats);
        this.airline = airline;
        this.isInternational = isInternational;
    }

    @Override
    public String getDetails() {
        return "Flight to " + getDestination() + " | Price: $" + getPrice() + " | Airline: " + airline +
                " | International: " + (isInternational ? "Yes" : "No") + " | Seats left: " + getAvailableSeats();
    }
}