package Conversao.src.application;

public class Conversão {

    public static void main(String[] args) {
        byte b;
        int i;

        b = 10;
        i = b * b;

        b = 12;
        b = (byte) (b * b);

        System.out.println("i e b: " + i + " e " + b);

    }

}
