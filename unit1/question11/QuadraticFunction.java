package unit1.question11;

import java.util.Scanner;

public class QuadraticFunction {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Construindo a equação:");

        System.out.print("   x²\b\b\b");
        int a = input.nextInt();

        System.out.print("+  x\b\b");
        int b = input.nextInt();

        System.out.print("+ ");
        int c = input.nextInt();

        input.close();

        System.out.println("\nEquação: " + a + "x² + " + b + "x + " + c + " = 0");

        int delta = delta(a, b, c);

        int[] result = new int[2];
        roots(a, b, delta, result);

        System.out.println("As raízes são " + result[0] + " e " + result[1]);

    }

    public static int delta(int a, int b, int c) {

        int result = (int) Math.pow(b, 2) - (4 * a * c);

        return result;
    }

    public static void roots(int a, int b, int delta, int[] result) {

        if (delta >= 0) {
            result[0] = (int) (-b + Math.sqrt(delta)) / (2 * a);
            result[1] = (int) (-b - Math.sqrt(delta)) / (2 * a);
        } else {
            System.out.println("Impossível! Delta é negativo!");
        }

    }

}
