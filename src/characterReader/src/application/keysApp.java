package characterReader.src.application;

import java.util.Scanner;
public class keysApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder text = new StringBuilder();

        System.out.println("Escreva uma frase finalizada por um ." );

        while (true) {
            String line = scanner.nextLine();
            if (line.equals(".")) {
                break;
            }
            text.append(line).append("\n");

        }
        System.out.println("Frase digitada: " + text.toString());


    }

}
