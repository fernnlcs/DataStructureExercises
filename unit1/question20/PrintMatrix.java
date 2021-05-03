package unit1.question20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintMatrix {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite os números desejados. Tecle ENTER" + 
        "\n1x para avançar na coluna" + 
        "\n2x para avançar de linha" + 
        "\n3x para finalizar");

        // Cria a matriz
        List<List<Integer>> matrix = new ArrayList<>();

        // Laço das linhas
        for (String m = input.nextLine(); m != "";  m = input.nextLine()) {

            // Cria uma linha
            List<Integer> line = new ArrayList<Integer>();
            matrix.add(line);

            // Laço das colunas
            for (String n = m; n != "";  n = input.nextLine()) {
                line.add(Integer.parseInt(n));
            }
        }

        System.out.println(matrix);

        input.close();
        
    }

}
