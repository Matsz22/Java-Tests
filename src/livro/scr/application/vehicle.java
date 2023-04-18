package livro.scr.application;

public class vehicle {
    int passengers;
    int fuelcap;
    int mpg;

    int range() {
        return mpg * fuelcap;
    }
}
