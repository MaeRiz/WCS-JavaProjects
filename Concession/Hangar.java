public class Hangar {

    public static void main(String[] args) {
        Car clio = new Car("Clio");
        Boat titanic = new Boat("Titanic");

        System.out.println(clio.doStuff());
        System.out.println(titanic.doStuff());
    }
}