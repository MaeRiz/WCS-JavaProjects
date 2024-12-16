class Movies {

    public static void main(String[] args) {
        
        String[] titleMovies = {
            "Les Aventuriers de l'arche perdue",
            "Indiana Jones et le Temple maudit",
            "Indiana Jones et la Dernière Croisade"
        };
        String[][] actors = {
            {"Harrison Ford", "Karen Allen", "Paul Freeman"},
            {"Harrison Ford", "Kate Capshaw", "Ke Huy Quan"},
            {"Harrison Ford", "Sean Connery", "Alison Doody"}
        };

        for (int i = 0; i < titleMovies.length; i++){
            System.out.println("Dans le film \"" + titleMovies[i] + "\" les acteurs sont :");
            for (String actor : actors[i]){
                System.out.println("- " + actor);
            }
        }
    }
}
