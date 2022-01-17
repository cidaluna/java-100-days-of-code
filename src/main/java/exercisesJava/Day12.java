package exercisesJava;

public class Day12 {
    public static void main(String[] args) {
        /*
         * Day 12 - Calculate the sum of odd numbers between 300 and 450 which are divisible by 15
         * Soma dos numeros impares entre 300 e 450 e que são divisíveis por 15.
         */
        int soma = 0;
        System.out.println("Os numeros ímpares no intervalo de 300 a 450 divisíveis por 15 são: ");
        for(int i=300;i<=450;i++){
            if((i % 2 != 0 )&&(i % 15 == 0)){
                System.out.print(i+ ", ");
                soma = soma + i;
            }
        }
        System.out.println("Soma: " +soma);
    }
}