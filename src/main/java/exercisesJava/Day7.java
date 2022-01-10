package exercisesJava;

public class Day7 {
    public static void main(String[] args) {
        // prime numbers between 1 and 500
        // numeros primos só podem ser aqueles dividos por 1 e por ele mesmo
        // 0 e 1 não são primos
        // 2 é o único número par primo
        // verificar de 1 a 500 quais são os números primos

        int inicio = 1;
        int fim = 500;
        System.out.println("Os numeros primos são: ");
        for (int i = inicio; i <= fim; i++) {
            if (verificaNumerosPrimos(i) == 1) {
                System.out.print(i + ", ");
            }
        }
    }

    public static int verificaNumerosPrimos(int num) {
        int contador = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                contador = contador + 1;
            }
        }
        if (contador == 2) {
            return 1;
        } else {
            return 0;
        }
    }
}