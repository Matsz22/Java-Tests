package primosAte100.src.application;

public class Primos2a100 {

    public static void main(String[] args) {

        int i, d;
        boolean x;

        for(i = 2; i < 100; i++) {
            x = true;

            for(d = 2; d <= i/d; d++)
                if((i % d) == 0) x = false;
            if(x)
                System.out.println(i + " é primo");

        }


    }

}


