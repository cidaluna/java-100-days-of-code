package exercisesJava;

public class Day1 {
    /**  Site: https://projecteuler.net/problem=1
     Day 01 - Problem 1:
     If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
     The sum of these multiples is 23.
     Find the sum of all the multiples of 3 or 5 below 1000.
    **/

    public static void  main(String[] args){
        double numeroTres = 3;
        double numeroCinco = 5;
        int soma = 0;

        // lembrar que eh possivel ter multiplos de 3 e de 5 ao mesmo tempo, considera 1 vez soh, com o uso do OR.
        for(int contador=1; contador<=10; contador++){
            if((contador % numeroTres == 0)||(contador % numeroCinco == 0)) {
                soma = soma + contador;
                System.out.println("Multiplo: " + contador + " | Soma acumulada: " + soma);
            }
        }
        System.out.println(":::::::::: Soma total acumulada: " +soma);
    }
}
