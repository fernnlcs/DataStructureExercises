package unit1.question25;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PeopleRegister {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        List<Person> people = new ArrayList<Person>();

        for (int i = 0; i < 3; i++) {
            System.out.println("\nREGISTRO DE PESSOA");

            System.out.print("Nome: ");
            String name = input.nextLine();
            
            System.out.print("Idade: ");
            int age = Integer.parseInt(input.nextLine());
            
            System.out.print("Sexo: ");
            char sex = input.nextLine().toUpperCase().toCharArray()[0];
            
            System.out.print("Altura: ");
            float height = Float.parseFloat(input.nextLine());
            
            System.out.print("Peso: ");
            float weight = Float.parseFloat(input.nextLine());

            Person person = new Person(name, age, sex, height, weight);
            people.add(person);
        }

        System.out.println("\n" + people);

        input.close();

    }

}
