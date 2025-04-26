public interface Reservable {
    boolean reserve(int seats);
    void cancelReservation(int seats);
}
