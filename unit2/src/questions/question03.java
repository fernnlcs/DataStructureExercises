package questions;

import interfaces.EdSimpleListInterface;
import structures.EdSimpleList;

public class question03 {
    
    public static void main(String[] args) {

        // Criando a lista
        EdSimpleListInterface<Integer> list = new EdSimpleList<Integer>();
        list.show();

        // Adicionando itens ao final
        System.out.println("\nADICIONANDO ITENS AO FINAL");
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.show();

        // Consultando o item final
        System.out.println("\nCONSULTANDO O ITEM FINAL");
        System.out.println(list.peekLast());

        // Adicionando itens ao início
        System.out.println("\nADICIONANDO ITENS AO INÍCIO");
        list.addFirst(-10);
        list.addFirst(-20);
        list.addFirst(-30);
        list.show();

        // Consultando o item inicial
        System.out.println("\nCONSULTANDO O ITEM INICIAL");
        System.out.println(list.peekFirst());
        
        // Adicionando itens em um lugar específico
        System.out.println("\nADICIONANDO ITENS EM UM LUGAR ESPECÍFICO");
        list.addAfter(0, 4);
        list.show();

        // Buscando pelo id
        System.out.println("\nBUSCANDO PELO ID 7");
        System.out.println(list.search(7));

        // Removendo id 7
        System.out.println("\nREMOVENDO ID 7");
        list.remove(7);
        list.show();

        // Removendo item final
        System.out.println("\nREMOVENDO ITEM FINAL");
        list.removeLast();
        list.show();

        // Removendo item inicial
        System.out.println("\nREMOVENDO ITEM INICIAL");
        list.removeFirst();
        list.show();

        // Consuntando topos
        System.out.println("\nCONSULTANDO TOPOS");
        System.out.println("Início: " + list.peekFirst());
        System.out.println("Fim: " + list.peekLast());
        
    }

}
