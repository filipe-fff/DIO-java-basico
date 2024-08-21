package edu.filipe.javaBasico.estruturaRepeticao.aula040;

public class BreakContinue {

    public static void main(String[] args) {
        for (int n = 1; n <= 10; n++){
            if (n==5) break;
            System.out.println(n);
        }
        System.out.println("-----------------");
        for (int n = 1; n <= 10; n++){
            if (n==5) continue;
            System.out.println(n);
        }
    }
}