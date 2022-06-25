import java.util.Locale;

public class User {
    private String firstName;
    private String lastName;

    public User(String firstName, String lastName){ // Criação do construtor, nao é void, nem retorna nada
        this.firstName = firstName.toUpperCase();
        this.lastName = lastName.toUpperCase();
    }

    public void setFirstName(String firstName){
        this.firstName = firstName.toUpperCase();
    }

    public void setLastName(String lastName){
        this.lastName = lastName.toUpperCase();
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
