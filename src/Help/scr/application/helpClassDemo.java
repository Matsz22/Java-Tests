package Help.scr.application;

public class helpClassDemo {
    public static void main(String[] args)
        throws java.io.IOException {
        char choice, ignore;
        help3 hlpobj = new help3();


        for(;;) {
            do {
                hlpobj.showMenu();
                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while(ignore != '\n');

            } while( !hlpobj.isValid(choice) );

            if(choice == 'q') break;

            System.out.println("\n");

            hlpobj.helpOn(choice);
        }
    }
}

