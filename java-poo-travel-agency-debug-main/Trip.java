public abstract class Trip implements Reservable {
    public String destination;
    public double price;
    public int availableSeats;

    public Trip(String destination, double price, int availableSeats) {
        this.destination = destination;
        this.price = price;
        this.availableSeats = availableSeats;
    }

    public String getDestination() {
        return destination;
    }

    public double getPrice() {
        return price;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    @Override
    public boolean reserve(int seats) {
        if (availableSeats >= seats) {
            availableSeats -= seats;
            return true;
        }
        return false;
    }

    @Override
    public void cancelReservation(int seats) {
        availableSeats += seats;
    }

    public abstract String getDetails();
}
