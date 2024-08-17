package edu.filipe.javaBasico.estruturaCondicional.aula37;

public class SwitchCase {

    public static void main(String[] args) {
        char tamanho = 'f';
        switch (tamanho) {
            case 'P': {
                System.out.println("Pequeno.");
                break;
            }
            case 'M': {
                System.out.println("Medio.");
                break;
            }
            case 'G': {
                System.out.println("Grande.");
                break;
            }
            default: {
                System.out.println("Indefinido.");
            }
        }

        char plano = 'f';
        System.out.println("O seu plano é : ");
        switch (plano) {
            case 'T': {
                System.out.println("- 5GB de Youtube.");
            }
            case 'M': {
                System.out.println("- Whatssap e Instagram grátis;");
            }
            case 'B': {
                System.out.println("- 100 minutos de ligação;");
                break;
            }
            default: {
                System.out.println("Plano indefinido...");
            }
        }
    }
}