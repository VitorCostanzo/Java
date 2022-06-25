import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Aula {

    public static void main(String[] args) {
        int num;
        String firstName, lastName;
        Scanner input = new Scanner(System.in);

        List<User> users = new ArrayList<>();

        System.out.print("Quantos usuarios quer cadastrar? ");
        num = Integer.parseInt(input.nextLine());

        for (int i = 0; i < num; i++){
            System.out.print("Nome do " + (i + 1) + "o usuario: ");
            firstName = input.nextLine();
            System.out.print("Sobrenome do " + (i + 1) + "o usuario: ");
            lastName = input.nextLine();
            System.out.println();
            User current = new User(firstName, lastName);
            users.add(current);
        }

        System.out.println("USUARIOS\n");

        for (int i = 0; i < users.size(); i++) {
            System.out.print(users.get(i).fullName() + "\n");
        }

        System.out.println("\n\n" + users.toString()); // toString é um método padrao de todos os objetos, mas podemos alterá-lo, como fizemos na classe User

    }
}