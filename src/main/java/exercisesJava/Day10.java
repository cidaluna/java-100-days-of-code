package exercisesJava;

public class Day10 {
    public static void main(String[] args) {
         /*
          * Site: https://projecteuler.net/
          * Day 10 - Problem 10 - Project Euler
          * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
          * Find the sum of all the primes below two million.
          */
        long soma = 0;

        for(int testaNumero=1;testaNumero<=2000000;testaNumero++){
            if(verificaPrimo(testaNumero))
                soma = soma + testaNumero;
        }
        System.out.println(soma);
    }

    public static boolean verificaPrimo(int numero){
        int contador = 0;
        for(int i=1;i<=numero;i++){
            if(numero % i == 0){
                contador++;
            }
        }
        if(contador == 2){
            return true;
        }else{
            return false; // poderia retornar zero se o numero nao eh primo, alterando o tipo de retorno da funcao e 1 primo
        }
    }
}
