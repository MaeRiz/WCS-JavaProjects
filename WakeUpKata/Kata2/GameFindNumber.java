/* Démarrage des neurones en cours :load:
Pour bien se réveiller ce matin, tu vas devoir écrire un programme en Java où l'utilisateur tente de deviner, via la console, un nombre magique (nombre aléatoire entre 1 et 100 généré par le programme).
Après chaque tentative, le programme indique si le nombre est trop grand, trop petit, ou correct.
Bonus : affiche le nombre total de tentatives nécessaires pour trouver le nombre.
Voici un exemple de retour à afficher :
Bienvenue dans le jeu du Nombre Magique !
J'ai choisi un nombre entre 1 et 100. Essaie de le deviner.
Entre ta proposition : 50
Trop grand !
Entre ta proposition : 25
Trop petit !
Entre ta proposition : 37
Félicitations, tu as trouvé le nombre magique [en 3 tentatives ] !
Pour cet exercice, tu peux avoir besoin d'utiliser la classe Scanner et Random :clin_d'œil: */


import java.util.Scanner;
import java.util.Random;


public class GameFindNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random randomNumberObj = new Random();
        int randomNum = randomNumberObj.nextInt(101);
        int countTry = 0;
        int numberTry = -1;

        System.out.println("Bienvenue dans le jeu du Nombre Magique !");
        System.out.println("J'ai choisi un nombre entre 1 et 100. Essaie de le deviner.");

        while (numberTry != randomNum) {
            System.out.print("Entre ta proposition : ");
            numberTry = scanner.nextInt();
            countTry++;
            if (numberTry == randomNum) {
                System.out.println("Félicitations, tu as trouvé le nombre magique ! [en " + countTry + " tentatives]");
                break;
            } else if (numberTry < randomNum) {
                System.out.println("Trop petit !");
            } else {
                System.out.println("Trop grand !");
            }
        }

        scanner.close();
    }
}
