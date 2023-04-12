package curtoCircuito.src.application;

public class exampleCurtoCircuito {

    public static void main(String[] args) {

        int n, d;

        n = 10;
        d = 2;


        if(d != 0 && (n % d) == 0)
            System.out.println(d + " é um fator de " + n); // operador curto && anula divisão por 0


        d = 0;

        if(d !=  0 && (n % d) == 0)
            System.out.println(d + " é um fator de " + n);  // não vai rodar



        if ( d != 0 & (n % d) == 0)
            System.out.println(d + " é um fator de " + n); // erro de divisão por 0
    }

}
