package udemy.src.application.exProdutoPoo;

import java.util.Locale;
import java.util.Scanner;

public class programProd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        programProduct product = new programProduct();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.println("Quantity: ");
        product.quantity = sc.nextInt();

        System.out.println(product.name + "," + product.price + "," + product.quantity);


        sc.close();
    }
}
