package edu.filipe.javaBasico.debugging.aula047;

import java.util.Scanner;

public class CalculadoraDeMedias {

    public static void main(String[] args) {
        String[] alunos = {"Pedro", "Filipe", "Ana", "Maria"};
        double media = calcularMediaDaTurma(alunos);
        System.out.printf("A média dos alunos é: %.2f.\n", media);
    }
    public static double calcularMediaDaTurma(String[] alunos) {
        Scanner teclado = new Scanner(System.in);
        double soma = 0;
        for(String aluno : alunos) {
            System.out.printf("Nota de %s: ", aluno);
            soma += teclado.nextDouble();
        }
        return soma / alunos.length;
    }
}