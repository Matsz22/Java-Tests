package exGravLua.src.application;

public class exemploLua {
    public static void main(String args[])  {

        double peso, massa, gravidadeTerra, gravidadeLua;

        massa = 8.15;
        gravidadeTerra = 9.81;
        gravidadeLua = gravidadeTerra * 17/100;
        peso = massa * gravidadeLua;

        System.out.print("Meu peso na lua é: " + peso + "kg");
    }	}


