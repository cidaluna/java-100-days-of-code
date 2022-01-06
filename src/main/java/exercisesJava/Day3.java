package exercisesJava;

public class Day3 {
    /**
     * Site: https://projecteuler.net/
     * Day 03 - Problem 3:
     * The prime factors of 13195 are 5, 7, 13 and 29.
     * What is the largest prime factor of the number 600851475143 ?
     **/

    public static void main(String[] args) {
        // revisando: numero primo só pode dividir por um e por ele mesmo.
        // números primos: 2,3,5,7,11,13,17,19,23,29,31,37,41,43,47...

        int i=2; // atribui a variavel i o menor numero primo.
        long num = 600851475143l;

        while(i<=num){
            if(num%i == 0){
                num = num / i;
                System.out.println("resultado da divisao: " + num + "  |  dividindo pelo primo: " + i);
            }else{
                i = i+1;
            }
        }
        System.out.println("O maior fator primo eh: " + i);
    }
}

