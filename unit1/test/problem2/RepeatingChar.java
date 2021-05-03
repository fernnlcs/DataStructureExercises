package unit1.test.problem2;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RepeatingChar {

    public static void main(String[] args) {

        // Abrindo scanner
        Scanner input = new Scanner(System.in);

        // Leitura da string
        System.out.println("Informe a string:");
        String str = input.nextLine().toLowerCase();

        input.close();

        // Apresentando resposta
        String answer = (verify(str) ? "\nHá" : "\nNão há") + " letras repetidas";

        System.out.println(answer);

    }

    public static boolean verify(String str) {

        boolean result = false;

        // Transformando str em List
        // Segue a mesma lógica da questão anterior
        List<Character> listStr = str.chars().mapToObj(e -> (char) e).collect(Collectors.toList());

        // Contador baseado em HashSet, que não permite repetições
        HashSet<Character> counter = new HashSet<Character>();

        // Percorre a string enquanto o resultado ainda for falso
        while (listStr.size() > 0 && !result) {

            // Captura a primeira letra e a remove
            Character ch = listStr.remove(0);

            // Caso repita, a resposta da questão é positiva
            if (!counter.add(ch)) {
                result = true;
            }

        }

        return result;

    }

}
