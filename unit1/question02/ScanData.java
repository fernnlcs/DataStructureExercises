package unit1.question02;

import java.util.Scanner;

public class ScanData {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Qual seu nome completo?");
        String name = input.nextLine();

        System.out.println("Qual a sua idade?");
        int age = Integer.parseInt(input.nextLine());

        System.out.println("Qual a sua altura?");
        float height = Float.parseFloat(input.nextLine());

        input.close();

        String answer = 
        "\nSeu nome completo: " + name + 
        "\nPrimeira letra do seu nome: " + name.charAt(0) +
        "\nSua idade: " + age +
        "\nSua altura: " + height;

        System.out.println(answer);
        
    }

}
