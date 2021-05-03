package questions;

import interfaces.EdStackInterface;
import structures.EdStack;

public class question01 {
    
    public static void main(String[] args) {
        
        // Criando a pilha
        EdStackInterface<Integer> stack = new EdStack<Integer>(5);
        stack.show();

        // Adicionando itens
        System.out.println("\nADICIONANDO ITENS");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.show();

        // Consultando o topo
        System.out.println("\nCONSULTANDO O TOPO");
        System.out.println(stack.peek());

        // Enchendo a pilha
        System.out.println("\nENCHENDO A PILHA");
        stack.push(40);
        stack.push(50);
        stack.show();

        // Estourando a pilha
        System.out.println("\nESTOURANDO A PILHA");
        try {
            stack.push(6);
        } catch (Exception e) {
            System.out.println("\n" + e.getMessage());
        }
        stack.show();

        // Removendo itens
        System.out.println("\nREMOVENDO ITENS");
        stack.pop();
        stack.pop();
        stack.pop();
        stack.show();

        // Esvaziando pilha
        System.out.println("\nESVAZIANDO A PILHA");
        stack.pop();
        stack.pop();
        stack.show();

        // Removendo itens com a pilha vazia
        System.out.println("\nREMOVENDO ITENS COM A PILHA VAZIA");
        try {
            stack.pop();
        } catch (Exception e) {
            System.out.println("\n" + e.getMessage());
        }
        stack.show();

    }

}
