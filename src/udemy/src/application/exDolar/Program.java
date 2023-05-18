package udemy.src.application.exDolar;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dolar price? ");
        double dolar = sc.nextDouble();
        System.out.print("How many dollar will be bought? ");
        double bought = sc.nextDouble();

        double value = calculator.conversion(dolar, bought);

        System.out.printf("Amount be paid in reais = %.2f", value);

        sc.close();
    }
}
