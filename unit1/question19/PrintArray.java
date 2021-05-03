package unit1.question19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintArray {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite os números desejados. Tecle ENTER" + 
        "\n1x para avançar na coluna" + 
        "\n2x para finalizar");

        List<Integer> list = new ArrayList<Integer>();

        for (String n = input.nextLine(); n != "";  n = input.nextLine()) {
            list.add(Integer.parseInt(n));
        }

        System.out.println(list);

        input.close();
        
    }

}
