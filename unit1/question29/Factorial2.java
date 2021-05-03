package unit1.question29;

import java.util.Scanner;

public class Factorial2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Fatorial de ");
        int end = input.nextInt();

        System.out.print(end + "! = ");

        int result = factorial(end);

        System.out.println("1 = " + result);

        input.close();

    }

    public static int factorial(int end) {
        int result = 1;

        if (end != 1) {
            System.out.print(end + " * ");
            result = end * factorial(end - 1);
        }

        return result;
    }

}
