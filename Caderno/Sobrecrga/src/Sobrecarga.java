public class Sobrecarga {
    public static void main(String[] args) {
        User user1 = new User("Vitor", "Costanzo");
        System.out.println(user1.fullName());
        System.out.println(user1.fullName(false));
    }
}