public class Animal{
    
    static final int MAX_SIZE = 50;
    private String name;
    private int legs;
    private int size; 
    private boolean carnivorous = false;
    
    public String introduce() {
        return "Hey, en tant que "
        + this.name + ", j'ai "
        + this.legs + " pattes et je "
        + (this.carnivorous ? "suis" : "ne suis pas")
        + " carnivore.";
    }

    public boolean isDangerous() {
        return this.size >= this.MAX_SIZE;
    }

    Animal(String name, int legs, int size) {
        this.name = name;
        this.legs = legs;
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getLegs() {
        return this.legs;
    }

    public void setCarnivorous(boolean carnivorous) {
        this.carnivorous = carnivorous;
    }

    public boolean getCarnivorous() {
        return this.carnivorous;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return this.size;
    }


}