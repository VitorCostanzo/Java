public class Aula {

    public static void main(String[] args){
        User user1 = new User("vitor", "costanzo");
        User user2 = new User("vitor", "costanzo");

        // POR PADRÃO
        //System.out.println(user1); // imprime referencia da memoria
        //System.out.println(user1.hashCode()); // imprime a numeração
        //System.out.println(user2); // imprime referencia da memoria
        //System.out.println(user2.hashCode()); // imprime a numeração
        //System.out.println(user1.equals(user2)); // retorna false, pois compara os hashcodes

        // na classe users: Shift + Shift -> altera-se os métodos hashcode e equals (@Override) - vide classe User
        System.out.println(user1); // imprime referencia da memoria
        System.out.println(user1.hashCode()); // imprime a numeração
        System.out.println(user2); // imprime referencia da memoria
        System.out.println(user2.hashCode()); // imprime a numeração
        System.out.println(user1.equals(user2)); // retorna true, pois os métodos alterados apontam users iguais para espaços iguais
    }
}