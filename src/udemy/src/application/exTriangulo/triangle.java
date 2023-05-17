package udemy.src.application.exTriangulo;

import java.util.Locale;
import java.util.Scanner;

public class triangle {
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

        double areaX = x.area();

        double areaY = y.area();

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
