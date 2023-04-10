package com.sanvalero;

public class NumerosRomanos {
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
