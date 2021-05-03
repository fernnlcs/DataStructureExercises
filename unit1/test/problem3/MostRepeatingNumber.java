package unit1.test.problem3;

import java.util.HashMap;
import java.util.Scanner;

public class MostRepeatingNumber {
    
    public static void main(String[] args) {
        
        // Abrindo scanner
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[8];

        HashMap<Integer, Integer> counter = new HashMap<Integer, Integer>();

        // Leitura dos inteiros
        System.out.println("Informe 8 inteiros:");

        for (int i = 0; i < 8; i++) {
            vetor[i] = input.nextInt();
            counter.put(vetor[i], 0);
        }

        input.close();

        // Contagem de cada inteiro
        for (int i = 0; i < 8; i++) {
            counter.put(vetor[i], counter.get(vetor[i]) + 1);
        }

        System.out.println(counter);

    }

}
