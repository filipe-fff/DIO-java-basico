package edu.filipe.javaBasico.terminal.aula030;

import java.util.Locale;
import java.util.Scanner;

public class ObjScanner {

    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Qual é o seu nome?: ");
        String nome = teclado.nextLine();

        System.out.print("Qual é o seu sobrenome?: ");
        String sobrenome = teclado.nextLine();

        System.out.print("Qual é a sua idade?: ");
        int idade = teclado.nextInt();

        System.out.print("Qual é a sua altura?: ");
        float altura = teclado.nextFloat();

        System.out.printf("O seu nome é %s.\n", nome);
        System.out.printf("O seu sobrenome é %s.\n", sobrenome);
        System.out.printf("A sua idade é %d.\n", idade);
        System.out.printf("A sua altura é %.2f.\n", altura);
    }
}