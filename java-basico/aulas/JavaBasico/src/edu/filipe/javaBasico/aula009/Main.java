package edu.filipe.javaBasico.aula009;

public class Main {
    public static void main(String[] args) {

        //  Tipo     Memória   Mínimo                       Máximo
        // -----------------------------------------------------------------
        //  byte     1 byte    -128                         127
        //  short    2 bytes   -32.768                      32.767
        //  int      4 bytes   -2.147.483.648               -2.147.483.647
        //  long     8 bytes   -9.223.372.036.854.775.808   -9.223.372.036.854.775.807
        //  float    4 bytes   -3,4028E + 38                3,4028E + 38
        //  double   8 bytes   -1,7976E + 308               1,7976E + 308
        //  -----------------------------------------------------------------



        double salarioMinimo = 2500;

        short valorCurto = 1;
        int valorNormal = valorCurto;
        short valorCurto2 = (short) valorNormal;
    }
}