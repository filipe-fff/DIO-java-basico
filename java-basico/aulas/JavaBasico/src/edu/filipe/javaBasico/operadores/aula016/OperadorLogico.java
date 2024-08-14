package edu.filipe.javaBasico.operadores.aula016;

public class OperadorLogico
{
    public static void main(String[] args)
    {
        boolean v1 = true;
        boolean v2 = false;

        if(v1 && v2)
        {
            System.out.println("Os dois são iguais.");
        }

        if(v1 || v2)
        {
            System.out.println("Algum é igual.");
        }
    }
}