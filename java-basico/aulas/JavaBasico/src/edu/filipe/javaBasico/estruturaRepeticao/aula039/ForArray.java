package edu.filipe.javaBasico.estruturaRepeticao.aula039;

public class ForArray {

    public static void main(String[] args) {

        String nomes[] = { "Filipe", "Julia", "Maria", "Matheus" };
        for (int p = 0; p < nomes.length; p++)
        {
            System.out.printf("Quem que na posição %d é o %s\n", p, nomes[p]);
        }
        System.out.println("\n");
        for (String nome : nomes) {
            System.out.printf("nome: %s\n", nome);
        }
    }
}