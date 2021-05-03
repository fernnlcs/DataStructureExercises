package unit1.question07;

import java.util.Scanner;

public class EvenOrOdd {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número inteiro:");
        int n = Integer.parseInt(input.nextLine());

        input.close();

        boolean odd = (n % 2 == 1);

        String answer = "\nO número " + n + " é " + (odd ? "ímpar" : "par");

        System.out.println(answer);

    }

}
