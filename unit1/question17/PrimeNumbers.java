package unit1.question17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbers {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Checar número ");
        int n = input.nextInt();

        List<Integer> prime = new ArrayList<Integer>();

        // Percorre de 0 a N
        for (int i = 2; i <= n; i++) {
            
            boolean iIsPrime = true;

            // Divide o número atual por cada primo encontrado
            for (int j = 0; j < prime.size() && iIsPrime; j++) {
                if (i % prime.get(j) == 0) {
                    iIsPrime = false;
                }
            }

            if (iIsPrime) {
                prime.add(i);
            }
        }

        System.out.println(n + (prime.contains(n) ? " é" : " não é") + " primo.");

        input.close();

    }

}
