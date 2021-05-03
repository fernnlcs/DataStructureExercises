package unit1.question24;

import java.util.Scanner;

public class InvertString {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o texto a ser invertido:");

        String original = input.nextLine();

        input.close();

        System.out.println(invert(original));

    }

    public static String invert(String original) {

        String result = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            result += original.toCharArray()[i];
        }

        return result;
    }

}
