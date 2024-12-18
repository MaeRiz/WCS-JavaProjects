/* 
@ici Wake Up, Stand Up, c'est l'heure du kata ! :notes_de_musique:
Premier kata en java la team : l'idée va être d'écrire un algorithme pour trouver le plus grand nombre dans un tableau.
Exemple de données en entrée : int[] tableau = {10, 5, 20, 15, 8};
Tu peux soit décrire ta logique dans la méthode main, soit créer une nouvelle méthode dans ta classe et l'appeler au sein de ta méthode main.
:danger: l'utilisation des imports n'est pas autorisée
*/


class Kata {

    private static int biggestNumber(int[] numbers) {
        int finalNum = numbers[0];
        for (int num : numbers) {
            if (num > finalNum) {
                finalNum = num;
            }
        }
        return finalNum;
    }

    public static void main(String[] args) {
        int[] tableau = {10, 5, 20, 15, 8, 20, 14, 58, 54, 64, 10, 12, 587, 6985, 548 };
        int number = biggestNumber(tableau);
        System.out.println("Le plus grand nombre de la liste est: " + number);
    }
}
