package udemy.src.application;

import java.util.Scanner;
public class whileEx2 {
    public static void main(String[] args) {

        System.out.println("enter 2 numbers in the keyboard: ");

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("first");
            } else if (x < 0 && y > 0) {
                System.out.println("Second");
            } else if (x < 0 && y < 0) {
                System.out.println("Third");
            } else {
                System.out.println("Fourth");
            }
            x = sc.nextInt();
            y = sc.nextInt();

        }
    }
}
