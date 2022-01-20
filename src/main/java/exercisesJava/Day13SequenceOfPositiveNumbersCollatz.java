package exercisesJava;

public class Day13SequenceOfPositiveNumbersCollatz {
    /*
    * Day 13 - Project Euler
    * The following iterative sequence is defined for the set of positive integers:
    * n → n/2 (n is even)
    * n → 3n + 1 (n is odd)
    * Using the rule above and starting with 13, we generate the following sequence:
    * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
    * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
    * Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
    */

    public static void main(String[] args) {
        double num = 13;

        for(int i=0;i<10;i++){
            System.out.print(num+ ", ");
            if (num % 2 != 0) {
                num = num * 3 + 1;
            } else {
                num = num / 2;
            }
        }
    }
}