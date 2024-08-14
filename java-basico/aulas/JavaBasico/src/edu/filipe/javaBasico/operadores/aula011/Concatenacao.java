package edu.filipe.javaBasico.operadores.aula011;

public class Concatenacao {
    public static void main(String[] args)
    {
        String numero = 1 + 1 + 1 + "1";
        System.out.println(numero);

        numero = 1 + "1" + 1 + 1;
        System.out.println(numero);

        numero = 1 + "1" + 1 + "1";
        System.out.println(numero);

        numero = "1" + 1 + 1 + 1;
        System.out.println(numero);

        numero = "1" + ( 1 + 1 + 1 );
        System.out.println(numero);
    }
}