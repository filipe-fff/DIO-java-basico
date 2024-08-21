package edu.filipe.javaBasico.tratamentoExecoes.aula043;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {
        try {
            Scanner teclado = new Scanner(System.in);
            System.out.print("Nome: ");
            String nome = teclado.next();
            System.out.print("Sobrenome: ");
            String sobrenome = teclado.next();
            System.out.print("Idade: ");
            int idade = teclado.nextInt();
            System.out.print("Altura: ");
            double altura = teclado.nextDouble();

            System.out.printf("Olá, me chamo %s %s,\n", nome, sobrenome);
            System.out.printf("Tenho %d anos,\n", idade);
            System.out.printf("Minha altura é %.2fm.", altura);
        } catch (InputMismatchException e) {
            System.err.println("Os campos idade e altura precisam serem numéricos.");
        }
    }
}