package com.sanvalero;

public class NumerosRomanos {
    public String play(int i) {
        if (i == 5) {
            return "V";
        }
        if (i == 10) {
            return "X";
        }
        if (i == 50) {
            return "L";
        }
        if (i == 100) {
            return "C";
        }
        if (i == 500) {
            return "D";
        }
        if (i == 1000) {
            return "M";
        }
        return "I";
    }
}