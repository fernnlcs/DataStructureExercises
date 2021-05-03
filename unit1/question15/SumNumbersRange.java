package unit1.question15;

import java.util.Scanner;

public class SumNumbersRange {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Somar de ");
        int start = input.nextInt();

        System.out.print("Até ");
        int end = input.nextInt();

        int result = 0;

        for (int i = start; i <= end; i++) {
            result += i;
        }

        System.out.println("Soma dos inteiros de " + start + " a " + end + ": " + result);

        input.close();

    }

}
