package edu.filipe.javaBasico.estruturaCondicional.aula033;

public class Simples {
    public static void main(String[] args) {
        double saldo = 10000;
        double dinheiroRetirado = 500;

        if( dinheiroRetirado <= saldo )
        {
            saldo -= dinheiroRetirado;
        }
        System.out.printf("Saldo => R$%.2f\n", saldo);
    }
}