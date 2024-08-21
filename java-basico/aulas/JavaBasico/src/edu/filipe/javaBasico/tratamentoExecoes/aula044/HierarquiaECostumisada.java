package edu.filipe.javaBasico.tratamentoExecoes.aula044;

import java.text.NumberFormat;
import java.text.ParseException;

public class HierarquiaECostumisada {

    public static void main(String[] args) {

        try {
            String cepFormatado = formartarCep("7778976788");
            System.out.println(cepFormatado);
        } catch (CepInvalidoExeption e) {
            e.printStackTrace();
        }

//        Number valor = Double.valueOf("a179.8");
//        Number valor = null;
//        try {
//            valor = NumberFormat.getInstance().parse("a179.8");
//            System.out.println(valor);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }

    }
    static String formartarCep(String cep) throws CepInvalidoExeption {
        if(cep.length() != 8) {
            throw new CepInvalidoExeption();
        }
        return "23.676-087";
    }
}