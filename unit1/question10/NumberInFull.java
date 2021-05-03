package unit1.question10;

import java.util.Scanner;

public class NumberInFull {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número inteiro:");
        int n = Integer.parseInt(input.nextLine());

        input.close();

        String answer = "Número ";

        switch (n) {
        case 1:
            answer += "um";
            break;
        case 2:
            answer += "dois";
            break;
        case 3:
            answer += "três";
            break;
        case 4:
            answer += "quatro";
            break;
        case 5:
            answer += "cinco";
            break;

        default:
            answer += "inválido";
            break;
        }

        System.out.println(answer);

    }

}
