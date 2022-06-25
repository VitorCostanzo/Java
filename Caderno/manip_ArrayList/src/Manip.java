import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Manip {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(); // cria Lista (tamanho dinâmico)
        names.add("Nome3"); // adiciona elementos na lista
        names.add("Nome4");
        for (int i = 0; i < names.size(); i++){
            System.out.print(names.get(i) + " "); // names.get(index) -> retorna o valor dentro do indice da lista
        }
        System.out.println();
        names.add("Nome2");
        names.add("Nome1");

        System.out.println(names); // imprime a lista fechada (já é string)

        for (int i = 0; i < names.size(); i++){ // imprime cada elemento separadamente
            System.out.print(names.get(i) + " ");
        }

        System.out.println("\n\n" + names.indexOf("Nome3")); // names.indexOf("String") -> retorna o indice da string dentro da lista

        Collections.sort(names); // Ordena uma lista
        System.out.println("\n" + names);

        System.out.println("\n" + names.isEmpty()); // booleana -> retorna se a lista esta vazia ou nao

        System.out.println("\n" + names.contains("Nome4")); // booleana -> retorna se a lista contem o elemento procurado ou nao

        System.out.println("\n" + names.size()); // retorna o tamanho da lista

        names.clear(); // limpa a lista
        System.out.println("\n\n" + names);
    }
}