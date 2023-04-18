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

        range1 = minivan.range();
        range2 = sportcar.range();

        System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + range1 + " miles");




        System.out.println("Sportcar can carry " + sportcar.passengers + " with a range of " + range2 + " miles");

    }
}
