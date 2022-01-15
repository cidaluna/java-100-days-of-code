package exercisesJava;

public class Day11 {
    public static void main(String[] args) {
        /* Cida Luna
         * Imprimindo sequencia de fibonacci, os 10 primeiros termos
         * Fibonacci(0) = 0
         * Fibonacci(1) = 1
         * Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)
         */

        int inicio = 0;
        int proximo = 1;
        int resultado;
        for(int i=1;i<=10;i++){
            resultado = inicio + proximo;
            inicio = resultado;
            int aux = proximo;
            proximo = inicio - proximo;
            System.out.println("F("+i+") = "+aux+" + "+proximo+ " => " +resultado+ ", ");
        }
    }
}




