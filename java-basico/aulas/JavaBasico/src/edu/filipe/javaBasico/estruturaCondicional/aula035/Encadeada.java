package edu.filipe.javaBasico.estruturaCondicional.aula035;

public class Encadeada {
    public static void main(String[] args) {
        int nota = 10;

        if (nota >= 7)
            System.out.println("APROVADO!");
        else if (nota >=5)
            System.out.println("RECUPERACAO");
        else
            System.out.println("REPROVADO");
    }
}