package exercisesJava;

public class Day2 {
    /**  Site: https://projecteuler.net/
     Day 02 - Problem 2:
     Each new term in the Fibonacci sequence is generated by adding the previous two terms.
     By starting with 1 and 2, the first 10 terms will be:
     1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
     By considering the terms in the Fibonacci sequence whose values do not exceed four million,
     find the sum of the even-valued terms.
     **/
    public static void  main(String[] args) {
    //coloquei a saida detalhada para facilitar na hora de conferir os resultados, como num teste de mesa =)
        int anterior = 0;
        int atual = 1;
        int resultado = 0;
        for(int i=1;i<=10;i++){
            resultado = atual + anterior;
            System.out.println("Linha "+i+ " : anterior (" +anterior+") + atual (" +atual+ ") = " +resultado);
            anterior = atual;
            atual = resultado;
        }
    }
}