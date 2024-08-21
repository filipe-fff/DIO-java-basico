package edu.filipe.javaBasico.estruturaRepeticao.aula041;

import java.util.concurrent.ThreadLocalRandom;

public class While {

    public static void main(String[] args) {

        double mesada = 15;
        while (mesada > 0) {
            double precoAleatorio = valorAleatorio();
            if(precoAleatorio > mesada){
                precoAleatorio = mesada;
            }
            System.out.printf("O joãozinho gastou R$%.2f em doces.\n", precoAleatorio);
            mesada -= precoAleatorio;
        }
    }
    public static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(1, 15);
    }
}