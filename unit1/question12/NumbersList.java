package unit1.question12;

import java.util.Scanner;

public class NumbersList {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Contar de ");
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
            result += (start++ + " ");
        }

        return result;
    }

    public static String useDoWhile(int start, int end) {
        
        String result = "\t";

        do {
            result += (start++ + " ");
        } while (start <= end);

        return result;
    }

    public static String useFor(int start, int end) {
        
        String result = "\t\t";

        for (int i = start; i <= end; i++) {
            result += (i + " ");
        }
        return result;
    }

}
