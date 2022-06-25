import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        User[] users = new User[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < users.length; i++){
            User current = new User(); // cria-se, dentro do for, um User atual, para ser alterado e só então o users recebe seus valores.
            System.out.print("Nome " + i + ": ");
            current.setFirstName(scanner.nextLine());
            System.out.print("Sobrenome " + i + ": ");
            current.setLastName(scanner.nextLine());
            users[i] = current;
        }
        System.out.println("\n\nNOMES\n\n");
        for (int i = 0; i < users.length; i++){
            System.out.print(users[i].getFirstName() + " ");
            System.out.print(users[i].getLastName() + "\n");
        }
    }
}
