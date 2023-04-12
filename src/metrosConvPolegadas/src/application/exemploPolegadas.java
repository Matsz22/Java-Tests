package metrosConvPolegadas.src.application;

public class exemploPolegadas {
    public static void main( String args[]) {

        double metros, polegadas;
        int counter;

        counter = 0;

        for(metros = 1; metros <= 120; metros++) {
            polegadas =  metros * 39.37;
            System.out.println(metros + " metros são " + polegadas + " polegadas ");

            counter++;
            if (counter == 12) {
                System.out.println();
                counter = 0;
            }
        }


    }
}






