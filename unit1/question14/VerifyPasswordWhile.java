package unit1.question14;

import java.util.Scanner;

public class VerifyPasswordWhile {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        final String PASSWORD = "1234";

        String pass = "";

        while (!pass.equals(PASSWORD)) {
            System.out.println("\nDigite a senha: ");
            pass = input.nextLine();

            System.out.println("SENHA " + (pass.equals(PASSWORD) ? "" : "IN") + "CORRETA");
        }

        input.close();

    }
    
}
