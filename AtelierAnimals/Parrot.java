public class Parrot extends Bird {

    boolean talk = true;

    public Parrot(String name, int legs, int size, boolean talk) {
        super(name, legs, size);
        this.talk = talk;
    }

    @Override
    public String introduce() {
        return "Hey, en tant que "
        + this.name + ", j'ai "
        + this.legs + " pattes et je ne suis pas carnivore.";
    }

    public void setTalk(boolean talk) {
        this.talk = talk;
    }

    public boolean canTalk() {
        return this.talk;
    }

}