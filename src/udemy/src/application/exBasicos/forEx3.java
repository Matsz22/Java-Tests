package udemy.src.application.exBasicos;

import java.util.Locale;
import java.util.Scanner;
public class forEx3 {
    public static void main(String[] args) {

        System.out.println("Enter the number of cases you want to test:");


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

            for(int i = 0; i < n; i++){

                System.out.println("Enter three values to take the weighted average:");

                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double c = sc.nextDouble();

                double media = (a * 2.0 + b * 3.0 + c * 5.0) /10.0;

                System.out.printf("%.1f%n", media);
            }
    }
}
