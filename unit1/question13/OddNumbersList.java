package unit1.question13;

import java.util.Scanner;

public class OddNumbersList {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Contar ímpares de ");
        int start = input.nextInt();

        System.out.print("Até ");
        int end = input.nextInt();

        input.close();

        System.out.println("Usando while: " + useWhile(start, end));
        System.out.println("Usando do-while: " + useDoWhile(start, end));
        System.out.println("Usando for: " + useFor(start, end));

    }

    public static String useWhile(int start, int end) {

        String result = "\t\t";

        while (start <= end) {
            if (start % 2 == 1) {
                result += (start + " ");
            }
            start++;
        }

        return result;
    }

    public static String useDoWhile(int start, int end) {

        String result = "\t";

        do {
            if (start % 2 == 1) {
                result += (start + " ");
            }
            start++;
        } while (start <= end);

        return result;
    }

    public static String useFor(int start, int end) {

        String result = "\t\t";

        for (int i = start; i <= end; i++) {
            if (i % 2 == 1) {
                result += (i + " ");
            }
        }
        return result;
    }

}
