package unit1.question08;

import java.util.Scanner;

public class SchoolAverage {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Qual sua 1ª nota?");
        float g1 = Float.parseFloat(input.nextLine());

        System.out.println("Qual sua 2ª nota?");
        float g2 = Float.parseFloat(input.nextLine());

        System.out.println("Qual sua 3ª nota?");
        float g3 = Float.parseFloat(input.nextLine());

        input.close();

        float average = (g1 + g2 + g3) / 3;

        String answer = "\nMédia " + average;

        if (average >= 7) {
            answer += "\nAprovado!";
        } else if (average >= 3.5) {
            answer += "\nEm recuperação!";
        } else {
            answer += "\nReprovado!";
        }

        System.out.println(answer);

    }

}
