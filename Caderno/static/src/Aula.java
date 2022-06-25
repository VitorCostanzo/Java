public class Aula {

    public static void main(String[] args){

        // STATIC - propriedades
        User user1 = new User("vitor", "costanzo");
        User user2 = new User("lara", "cordeiro");
        User user3 = new User("caio", "costanzo");

        System.out.println(user1.getCount()); // compartilhada
        System.out.println(user2.getCount()); // compartilhada
        System.out.println(user3.getCount()); // compartilhada

        System.out.println();

        // STATIC - métodos
        City bauru = new City("bauru", 350000);
        City.setCount(); // método pertence à classe
        City piracicaba = new City("piracicaba", 365000);
        City.setCount(); // método pertence à classe
        System.out.println(City.getCount());

        // OBS: métodos static podem chamar outros métodos static
        dwight();
    }
    public static void dwight(){

    }
}