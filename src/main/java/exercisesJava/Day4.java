package exercisesJava;

public class Day4 {
    /**
     * Desafio 04
     * Dado um numero, aplicar o reverso e verificar se eh palindromo.
     **/
    public static int verificaPalindromo(int numero_inicial) {

        int reverso = 0;
        int temp = numero_inicial;
        while (temp > 0) {
            int ultimo_numero = temp % 10; // pega o ultimo digito
            reverso = reverso * 10 + ultimo_numero; //adiciona ultimo digito
            temp = (temp / 10); // remove o ultimo digito
            System.out.println("Temp: " +temp+ " Reverso: " +reverso);
        }
        if(numero_inicial == reverso){
            System.out.println("Numero inicial === reverso: " + numero_inicial);
            System.out.println("---------------------------------------- \n ");
        }else{
            System.out.println(numero_inicial+ " e " +reverso+" São números diferentes!!!");
            System.out.println("---------------------------------------- \n ");
        }
        return numero_inicial;
    }

    public static void main(String[] args) {

        verificaPalindromo(9009);
        verificaPalindromo(12345);
        verificaPalindromo(1425241);
    }
}
