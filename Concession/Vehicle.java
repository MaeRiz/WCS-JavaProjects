public abstract class Vehicle {

    // Attributes
    String brand;
    int kilometers;

    // Constructor
    public Vehicle(String brand) {
        this.brand = brand;
        this.kilometers = 0;
    }

    // Getter and Setter
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return this.brand;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }
    public int getKilometers(){
        return this.kilometers;
    }

    // Methodes
    public abstract String doStuff();

}