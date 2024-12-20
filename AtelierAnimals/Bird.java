public abstract class Bird extends Animal {

    boolean fly = true;

    public Bird(String name, int legs, int size) {
        super(name, legs, size);
    }

    public boolean canFly() {
        return fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }

    class abstract void fly();
}