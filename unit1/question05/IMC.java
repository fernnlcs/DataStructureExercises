package unit1.question05;

import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe seu peso (kg):");
        float weight = Float.parseFloat(input.nextLine());

        System.out.println("Informe sua altura (m):");
        float height = Float.parseFloat(input.nextLine());

        input.close();

        String answer = (height != 0) ? 
        "\nSeu Índice de Massa Corporal é " + weight / (height * height) : 
        "\nTentativa de divisão por zero encontrada!";

        System.out.println(answer);

    }

}
