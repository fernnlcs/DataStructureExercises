package unit1.question03;

import java.util.Scanner;
import java.lang.Math;

public class InstantCalculator {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int x = Integer.parseInt(input.nextLine());

        System.out.println("Mais um: ");
        int y = Integer.parseInt(input.nextLine());

        input.close();

        String answer =
        "\n" + x + " + " + y + " = " + (x + y) + 
        "\n" + x + " - " + y + " = " + (x - y) + 
        "\n" + x + " * " + y + " = " + (x * y) + 
        "\n" + x + " / " + y + " = " + (x / y) + 
        "\n" + x + " % " + y + " = " + (x % y) + 
        "\n" + x + " ^ " + y + " = " + Math.pow(x, y) + 
        "\n√" + x + " = " + Math.sqrt(x) +
        "\n√" + y + " = " + Math.sqrt(y);

        System.out.println(answer);
        
    }

}
