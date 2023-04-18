package retornar.scr.application;

public class metodoReturn  {
    public static void main(String[] args) {
        int i;

        for(i=0; i<10; i++) {
            if(i == 5) return; //para em 5
            System.out.println(i);
        }
    }
}
