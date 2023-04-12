package estruturaSequencial2.src.application;

import java.util.Scanner;

public class estrutura2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();


        if (A % B == 0) {
            System.out.println("Multiplo");
        }
        else {
            System.out.println("nao multiplo");
        }


        sc.close();
    }

}
