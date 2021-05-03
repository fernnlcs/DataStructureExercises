package unit1.question04;

import java.util.Scanner;

public class PizzeriaBill {
    
    public static void main(String[] args) {
        
        final float SODA_PRICE = 1.5f;
        final float PIZZA_SLICE_PRICE = 3f;
        final float TIP_FEE = 0.1f;

        Scanner input = new Scanner(System.in);

        System.out.println("Quantos refrigerantes foram consumidos?");
        int soda = Integer.parseInt(input.nextLine());

        System.out.println("Quantas fatias de pizza foram consumidas?");
        int slices = Integer.parseInt(input.nextLine());

        System.out.println("Quantas pessoas estão na mesa?");
        int clients = Integer.parseInt(input.nextLine());

        input.close();

        float subtotal = soda * SODA_PRICE + slices * PIZZA_SLICE_PRICE;
        float tip = subtotal * TIP_FEE;
        float total = subtotal + tip;
        float individual = total/clients;

        String answer = 
        "\nRESUMO DA CONTA:" + 
        "\nSubtotal: R$ " + subtotal +
        "\nGorjeta: R$ " + tip +
        "\n-----------------" +
        "\nTotal: R$ " + total +
        "\nIndividual: R$ " + individual;

        System.out.println(answer);
        
    }

}
