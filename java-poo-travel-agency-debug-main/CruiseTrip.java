public class CruiseTrip extends Trip {
    public int cabinCount;
    public boolean hasPool;

    public CruiseTrip(String destination, double price, int availableSeats, int cabinCount, boolean hasPool) {
        super(destination, price, availableSeats);
        this.cabinCount = cabinCount;
        this.hasPool = hasPool;
    }

    @Override
    public String getDetails() {
        return "Cruise to " + getDestination() + " | Price: $" + getPrice() + " | Cabins: " + cabinCount +
                " | Pool: " + (hasPool ? "Yes" : "No") + " | Seats left: " + getAvailableSeats();
    }
}
