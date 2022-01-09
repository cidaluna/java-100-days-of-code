package exercisesJava;

public class Day6 {
    // soma dos quadrados dos numeros naturais de 1 a 10
    public static void main(String[] args) {
        int quadrado=0;
        int soma=0;
        for (int i = 1; i <= 10; i++) {
            quadrado = i * i;
            System.out.println("O quadrado de " + i + " eh: " + quadrado);
            soma = soma + quadrado;
        }
        System.out.println("A soma dos quadrados eh: " +soma);
    }
}
