package udemy.src.application.exBasicos;

import java.util.Scanner;
public class whileEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a senha: ");

        double key = sc.nextDouble();

        while(key != 2002) {
            System.out.println("Essa não é a chave correta");
            key = sc.nextDouble();
        }
        System.out.println("A senha está certa: " + key);

        sc.close();


    }
}
