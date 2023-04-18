package parametros.scr.application;

public class parmDemo {
    public static void main(String[] args) {
        parametros e = new parametros();

        if(e.isEven(10)) System.out.println("10 is even.");
        if(e.isEven(9)) System.out.println("9 is even.");
        if(e.isEven(8)) System.out.println("8 is even.");
    }
}
