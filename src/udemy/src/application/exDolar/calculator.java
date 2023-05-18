package udemy.src.application.exDolar;

public class calculator {
    public static final double IOF = 0.06;

    public static double conversion(double dolar, double bought) {
        double value = dolar * bought;
        return  value += value * IOF;
    }

}
