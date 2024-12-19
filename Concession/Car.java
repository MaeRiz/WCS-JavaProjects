public class Car extends Vehicle {

    public Car(String brand) {
        super(brand);
    }

    @Override
    public String doStuff() {
        return "Je suis "
        + this.brand
        + " et je fais vroum vroum !";
    }
}