package livro.scr.application;

public class twoVehicles {
    public static void main(String[] args) {
        vehicle minivan = new vehicle();
        vehicle sportcar = new vehicle();

        int range1, range2;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;

        System.out.print("Minivan can carry " + minivan.passengers + ". ");

        minivan.range();



        System.out.print("Sportcar can carry " + sportcar.passengers + ". ");

        sportcar.range();


    }
}
