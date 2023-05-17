package udemy.src.application.exBasicos;

import java.util.Scanner;
import java.util.Locale;
public class forEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("How many divisions would you like to make? ");
        int n = sc.nextInt();
            for(int i = 0; i < n; i++){

                System.out.println("Choose the numerator");
            int a = sc.nextInt();
                System.out.println("and the denominator");
            int b = sc.nextInt();
                if(b == 0){
                    System.out.println("Impossible division");
                }
                else {
                    double div = (double) a / b;
                    System.out.printf("%.2f%n", div);
                }




        }



    }
}
