package udemy.src.application.testes;

public class testSpliComLoop {
    public static void main(String[] args) {

        String a = "potato ice cube bala apple orange";

        String[] vect = a.split(" ");

        if (vect.length >= 6) {
            String word1 = vect[0];
            String word2 = vect[1];
            String word3 = vect[2];
            String word4 = vect[3];
            String word5 = vect[4];
            String word6 = vect[5];

            System.out.println(word1);
            System.out.println(word2);
            System.out.println(word3);
            System.out.println(word4);
            System.out.println(word5);
            System.out.println(word6);
        }
        else {
        System.out.println("O array não tem pelo menos 6 elementos.");
        }

        // Usando loop para percorrer o array
        for (String word : vect) {
            System.out.println(word);
        }
    }
}

