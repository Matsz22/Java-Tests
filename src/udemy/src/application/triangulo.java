package udemy.src.application;

import java.util.Locale;
import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        triangleTwo x, y;
        x = new triangleTwo();
        y = new triangleTwo();

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextInt();
        x.b = sc.nextInt();
        x.c = sc.nextInt();
        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextInt();
        y.b = sc.nextInt();
        y.c = sc.nextInt();

        double p = (x.a + x.b + x.c) / 2.0;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

        p = (y.a + y.b + y.c) / 2.0;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        System.out.printf("triangle X area: %.4f%n", areaX);
        System.out.printf("triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        }
        else {
            System.out.println("Larger area: Y");
        }

        sc.close();
    }
}
