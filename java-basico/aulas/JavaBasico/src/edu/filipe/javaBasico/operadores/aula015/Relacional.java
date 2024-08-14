package edu.filipe.javaBasico.operadores.aula015;

public class Relacional
{
    public static void main(String[] args)
    {
        String nome1 = "Filipe";
        String nome2 = new String("Filipe");

        System.out.println("Nome1 é igual a nome2 e do mesmo tipo?: " + (nome1 == nome2));
        System.out.println("Nome1 é igual a nome2?: " + nome1.equals(nome2));


        int a = 3;
        int b = 2;

        System.out.println("A é igual a B?: " + (a == b));

        System.out.println("A é diferente de B?: " + (a != b));

        System.out.println("A é maior que B?: " + (a > b));
    }
}