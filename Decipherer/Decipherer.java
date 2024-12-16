class Decipherer {

    public static String decrypt(String message) {
        int keyNumber = message.length() / 2;
        String subStr = message.substring(5, 5+keyNumber);
        String replaced = subStr.replace("@#?", " ");
        String reversed = new StringBuilder(replaced).reverse().toString();
        return reversed;
        
        // Ultra optimized space below
        // return new StringBuilder(message.substring(5, 5+(message.length() / 2)).replace("@#?", " ")).reverse().toString();
    }

    public static void main(String[] args) {
        // Messages à déchiffrer
        String message1 = "0@sn9sirppa@#?ia'jgtvryko1";
        String message2 = "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj";
        String message3 = "aopi?sedohtém@#?sedhtmg+p9l!";
        
        // Déchiffrement des messages
        System.out.println("Le message 1 est: " + decrypt(message1));
        System.out.println("Le message 2 est: " + decrypt(message2));
        System.out.println("Le message 3 est: " + decrypt(message3));
    }
}