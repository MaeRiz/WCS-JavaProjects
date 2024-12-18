public class Main {

    public static void main(String[] args) {
        Animal peroquet = new Animal("Péroquet", 2, 30);
        Animal lion = new Animal("Lion", 4, 55);
        lion.setCarnivorous(true);

        System.out.println(peroquet.introduce());
        System.out.println("Le " + peroquet.getName() + " est il dangereux ? "  + peroquet.isDangerous());
        System.out.println(lion.introduce());
        System.out.println("Le " + lion.getName() + " est il dangereux ? "  + lion.isDangerous());
    }
}