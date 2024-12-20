public class Lion extends Animal {

    boolean alpha = true;

    public Lion(String name, int legs, int size, boolean alpha) {
        super(name, legs, size);
        this.alpha = alpha;
    }

    @Override
    public String introduce() {
        return "Hey, en tant que "
        + this.name + ", j'ai "
        + this.legs + " pattes et je suis carnivore.";

    public void setAlpha(boolean alpha) {
        this.alpha = alpha;
    }

    public boolean isAlpha() {
        return this.alpha;
    }
}