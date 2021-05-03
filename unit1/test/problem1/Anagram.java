package unit1.test.problem1;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Anagram {

    public static void main(String[] args) {

        // Abrindo scanner
        Scanner input = new Scanner(System.in);

        // Leitura das strings
        System.out.println("Informe a primeira string:");
        String str1 = input.nextLine().toLowerCase();

        System.out.println("Informe a segunda string:");
        String str2 = input.nextLine().toLowerCase();

        // Fechando scanner
        input.close();

        // Apresentando resposta
        String answer = verify(str1, str2) ? "\nSão anagramas" : "\nNão são anagramas";

        System.out.println(answer);

    }

    public static boolean verify(String str1, String str2) {

        boolean result = true;

        // Transformando str1 em List
        // Precisa passar por IntStream e mapear os elementos, por diferenças na natureza das variáveis
        List<Character> listStr1 = str1.chars().mapToObj(e -> (char) e).collect(Collectors.toList());

        // Percorrendo str2
        for (int i = 0; i < str2.length() && result; i++) {

            // Procurando o caractere str2[i] em str1
            int j = listStr1.indexOf(str2.charAt(i));

            // Foi encontrado algum?
            if (j != -1) {
                // Sim: removemos da lista o primeiro resultado
                listStr1.remove(j);
            } else {
                // Não: interrompemos o loop
                result = false;
            }

        }

        // Caso sobre alguma letra, é falso
        if (listStr1.size() != 0) {
            result = false;
        }

        return result;

    }

}
