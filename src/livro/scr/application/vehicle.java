package livro.scr.application;

public class vehicle {
    int passengers;
    int fuelcap;
    int mpg;

    void range() {
        System.out.println("Range is " + fuelcap * mpg);
    }
}
