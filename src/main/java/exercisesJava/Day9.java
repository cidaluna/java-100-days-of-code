package exercisesJava;

import java.util.Scanner;

public class Day9 {
    public static void main(String[] args) {
        /*
         * Day 9 - 100 Days of Code - Java
         * Escrever um programa que dado os catetos calcule a hipotenusa
         * em um triangulo retangulo, hipotenusa² = catetoA² + catetoB² (5² = 3² + 4²)
         * Hipotenusa = sqrt(catetoA² + catetoB²)
         */

        int catetoA = 3;
        int catetoB = 4;
        System.out.println("hipotenusa² = catetoA² + catetoB²");
        System.out.println("hipotenusa² = " + catetoA + "² + " + catetoB + "²");

        double quadradoCatetoA = Math.pow(catetoA, 2);
        double quadradoCatetoB = Math.pow(catetoB, 2);
        double somaDosQuadrados = quadradoCatetoA + quadradoCatetoB;
        System.out.println("hipotenusa² = " + quadradoCatetoA + " + " + quadradoCatetoB);
        System.out.println("hipotenusa² = " + somaDosQuadrados);
        System.out.println("hipotenusa = √" + somaDosQuadrados);
        System.out.println("hipotenusa = " + Math.sqrt(somaDosQuadrados));

    }
}