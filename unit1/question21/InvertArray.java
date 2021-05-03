package unit1.question21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InvertArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(
                "Digite os números desejados. Tecle ENTER" + "\n1x para avançar na coluna" + "\n2x para finalizar");

        List<Integer> original = new ArrayList<Integer>();

        for (String n = input.nextLine(); n != ""; n = input.nextLine()) {
            original.add(Integer.parseInt(n));
        }

        input.close();

        System.out.println(invert(original));

    }

    public static List<Integer> invert(List<Integer> original) {

        List<Integer> result = new ArrayList<Integer>();

        for (int i = original.size() - 1; i >= 0; i--) {
            result.add(original.get(i));
        }

        return result;
    }

}
