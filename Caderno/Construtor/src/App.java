public class App {
    public static void main(String[] args) {
        User users[] = new User[]{ // utilização do construtor, traz os objetos à vida
                new User("Vitor", "Costanzo"),
                new User("Lara", "Cordeiro"),
                new User("Rosilene", "Floriano"),
                new User("Caio", "Costanzo"),
                new User("Carol", "Talhamento")
        };

        for (int i = 0; i < users.length; i++){
            System.out.print(users[i].getFirstName() + " ");
            System.out.println(users[i].getLastName());
        }
    }
}
