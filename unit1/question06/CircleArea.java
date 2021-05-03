package unit1.question06;

import java.util.Scanner;

public class CircleArea {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o raio do círculo:");
        int radius = Math.abs(Integer.parseInt(input.nextLine()));

        input.close();

        float area = (float) (Math.PI * Math.pow(radius, 2));
        
        String answer = "\nPara raio " + radius + ", a área do círculo é " + area;

        System.out.println(answer);

    }

}
