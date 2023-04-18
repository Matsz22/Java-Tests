package livro.scr.application;

public class twoVehicles {
    public static void main(String[] args) {
        vehicle minivan = new vehicle();
        vehicle sportcar = new vehicle();
        double gallons;
        int dist = 252;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;

        gallons = minivan.fuelneeded(dist);

        System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel.");

        gallons = sportcar.fuelneeded(dist);

        System.out.println("To go " + dist + " miles sportcar needs " + gallons + " gallons of fuel.");
    }
}
