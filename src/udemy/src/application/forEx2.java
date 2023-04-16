package udemy.src.application;

import java.util.Scanner;
public class forEx2 {
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
