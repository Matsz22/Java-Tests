package udemy.src.application.exBasicos;

import java.util.Scanner;
public class forEx2a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Um valor limite para números impares ");
        int x = sc.nextInt();


        for(int i = 0; i <= x; i = i++ ) {
            if(i % 2 != 0); {
                System.out.println("O número impar é: " + i);

            }
        }
    }
}
