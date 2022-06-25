import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>(); // Criação de Listas -> List<tipo> nome = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            User current = new User("nome " + i, "sobrenome " + i); // Cria um usuario atual dentro do loop
            users.add(current); // Adiciona as informações do atual para a lista
        }
        for (int i = 0; i < users.size(); i++) {
            System.out.print(users.get(i).getFirstName() + " "); // users.get(index) para acessar uma posição da lista
            System.out.println(users.get(i).getLastName());
        }
    }
}
