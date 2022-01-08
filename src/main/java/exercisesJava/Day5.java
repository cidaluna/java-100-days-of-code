package exercisesJava;

public class Day5 {

    // Minimo Multiplo Comum de 12 e 20
    // 2 * 2 * 3 * 5 = 60
    public static void main(String[] args) {

        int num1 = 12, num2 = 20;
        int aux1, aux2, resto, resultado;

        aux1 = num1;
        aux2 = num2;
        do{
            resto = aux1 % aux2;
            System.out.println("Resto: " + resto);
            aux1 = aux2;
            System.out.println("Aux1: " + aux1);
            aux2 = resto;
            System.out.println("Aux2: " + aux2);
            System.out.println("-------------");
        }while(resto != 0);

        resultado = (num1 * num2) / aux1;
        System.out.println("MMC de " + num1 + " e " + num2 +" eh " + resultado);
    }
}