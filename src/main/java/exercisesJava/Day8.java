package exercisesJava;
import java.util.Scanner;

public class Day8 {
    public static void main(String[] args) {
    /*
     * Day 8 - 100 Days of Code - Java
     * Escrever um programa que receba dois números e ao final mostre a soma,
     * subtração, multiplicação e a divisão dos números lidos
     * sum, subtraction, multiplication and division
     */

    Scanner le = new Scanner(System.in);

    int primeiroNumero, segundoNumero, soma, subtracao, divisao, multiplicacao;

    System.out.print("Entre com o primeiro numero inteiro: ");
    primeiroNumero = le.nextInt();

    System.out.print("Entre com o segundo numero inteiro: ");
    segundoNumero = le.nextInt();

    soma = primeiroNumero + segundoNumero;
    subtracao =primeiroNumero -segundoNumero;
    divisao =primeiroNumero /segundoNumero;
    multiplicacao =primeiroNumero *segundoNumero;

    System.out.println("Soma: "+soma);
    System.out.println("Subtracao: "+subtracao);
    System.out.println("Divisao: "+divisao);
    System.out.println("Multiplicacao: "+multiplicacao);
    }
}

