package parametros.scr.application;

public class isFact {
    public static void main(String[] args) {
        isFactor x = new isFactor();

        if(x.isFactor(2,20)) System.out.println("2 is factor");
        if(x.isFactor(3,20)) System.out.println("this won't be displayed");
    }
}

