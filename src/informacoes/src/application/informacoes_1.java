package informacoes.src.application;

import java.io.IOException;

public class informacoes_1 {

    public static void main(String[] args)
            throws IOException {
        char choice;

        System.out.println("Help on:");
        System.out.println("	1- if" );
        System.out.println(" 	2- switch");
        System.out.println("chose one: ");
        choice = (char) System.in.read();

        System.out.println("\n");

        switch(choice) {
            case '1':
                System.out.println("The if:\n");
                System.out.println("if (condition) instruction;");
                System.out.println("else condition;");
                break;
            case '2':
                System.out.println("The switch:\n");
                System.out.println("switch (expression) {");
                System.out.println("	case constant:");
                System.out.println("		statement sequence:");
                System.out.println("		break;");
                System.out.println("	// ...");
                System.out.println("}");
                break;
            default:
                System.out.print("Option not found");
        }





    }










}


