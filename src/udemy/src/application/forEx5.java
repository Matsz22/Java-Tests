package udemy.src.application;

import java.util.Scanner;
public class forEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("number you want to factor");

        int n = sc.nextInt();

        int fat = 1;
        for (int i=1; i<=n; i++){
            fat = fat * i;
        }
        System.out.println(fat);
    }
}
