package com.sanvalero;

public class NumerosRomanos {

    enum ValorLetrasRomanas {
        I(1),
        V(5),
        X(10),
        L(50),
        C(100),
        D(500),
        M(1000);

        int valor;

        ValorLetrasRomanas(int valor) {
            this.valor = valor;

        }
    }
    public String play(int numero) {

        StringBuilder resultado = new StringBuilder();

        if (numero >= 10) {
            for (int i = 0; i < numero/10; i++) {
                resultado.append("X");
            }
        } else {
            for (int j = 0; j < numero; j++) {
                resultado.append("I");
            }
        }

//        if (numero == 5) {
//            return "V";
//        }
//        if (numero == 10) {
//            return "X";
//        }
//        if (numero == 50) {
//            return "L";
//        }
//        if (numero == 100) {
//            return "C";
//        }
//        if (numero == 500) {
//            return "D";
//        }
//        if (numero == 1000) {
//            return "M";
//        }
        return resultado.toString();
    }
}
