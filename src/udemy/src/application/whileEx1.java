package udemy.src.application;

import java.util.Scanner;
public class whileEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total gas consult ");
        System.out.println("chose one option:");
        System.out.println("1. Alcool\n2. Gas\n3. Diesel\n4. Fim");

        int alcool = 0;
        int gas = 0;
        int diesel = 0;

        int chose = sc.nextInt();

        while (chose != 4) {
            if (chose == 1) {
                System.out.println("Alcool valor: ");
                alcool++;
            }
            else if (chose == 2){
                System.out.println("Gas valor: ");
                gas++;
            }
            else if (chose == 3) {
                System.out.println("Diesel valor: ");
                diesel++;
            }
            chose = sc.nextInt();
        }
        System.out.println("Thanks");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gas :" + gas);
        System.out.println("diesel: " + diesel);

        sc.close();
    }                           //obs correção do curso, mas que código feio e ruim ein
}
