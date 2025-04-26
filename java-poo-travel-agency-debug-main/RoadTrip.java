public class RoadTrip extends Trip {
    public int durationInDays;
    public boolean includesGuide;

    public RoadTrip(String destination, double price, int availableSeats, int durationInDays, boolean includesGuide) {
        super(destination, price, availableSeats);
        this.durationInDays = durationInDays;
        this.includesGuide = includesGuide;
    }

    @Override
    public String getDetails() {
        return "Road Trip to " + getDestination() + " | Price: $" + getPrice() + " | Duration: " + durationInDays +
                " days | Guide included: " + (includesGuide ? "Yes" : "No") + " | Seats left: " + getAvailableSeats();
    }
}