package edu.filipe.javaBasico.estruturaRepeticao.aula042;

import java.util.Random;

public class DoWhile {

    public static void main(String[] args) {

        do {
            System.out.println("Tocando...");
        } while (tocar());
    }

    private static boolean tocar() {

        boolean tocado = new Random().nextInt(3) != 1;
        System.out.println("Tocado?: "+(tocado?"Não":"Sim"));
        return tocado;
    }
}