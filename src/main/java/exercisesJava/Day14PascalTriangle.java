package exercisesJava;

public class Day14PascalTriangle {
    /*
     * Day 14 - Pascal's Triangle - Imprimindo o Triângulo de Pascal
     * Exemplo:
     * . . . . . . 1 . . . . . .
     * . . . . . 1 . 1 . . . . .
     * . . . . 1 . 2 . 1 . . . .
     * . . . 1 . 3 . 3 . 1 . . .
     * . . 1 . 4 . 6 . 4 . 1 . .
     * . 1 . 5 .10 . 10 . 5 .1 .
     */

    public static void main(String[] args) {

        int totalLinhas = 6;
        int espacos = totalLinhas;
        int numero = 1;

        for(int i=0;i<totalLinhas;i++){

            for(int s=1;s<=espacos;s++){
                System.out.print(" "); // cria espacos entre os numeros
            }
            numero=1;
            for(int j=0; j<=i;j++){
                System.out.print(numero+ " ");
                numero = numero * (i-j)/(j+1);
            }
            espacos--;
            System.out.println();
        }
    }
}
