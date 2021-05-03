package unit1.question16;

import java.util.Scanner;

public class Factorial {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Fatorial de ");
        int end = input.nextInt();

        System.out.print(end + "! = ");

        int result = 1;

        while (end > 1) {
            System.out.print(end + " * ");
            result *= end--;
        }

        System.out.println("1 = " + result);

        input.close();

    }

}
