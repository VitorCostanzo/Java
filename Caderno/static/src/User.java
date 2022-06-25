public class User {
    private String firstName;
    private String lastName;
    private static int count = 0; // a propriedade static é compartilhada entre todos os objetos da classe

    public User (String firstName, String lastName){
        this.firstName = firstName.toUpperCase();
        this.lastName = lastName.toUpperCase();
        count = count + 1; // dentro do construtor, ja adiciona 1 à contagem da classe
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName.toUpperCase();
    }

    public void setLastName(String lastName) {
        this.lastName = lastName.toUpperCase();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getCount() {
        return count;
    }
}
