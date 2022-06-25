public class User {
    private String firstName;
    private String lastName;

    public User(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String fullName(){ // cria a função fullName
        return firstName.toUpperCase() + " " + lastName.toUpperCase();
    }

    public String fullName(boolean showLastName){ // sobrecarrega a função fullName com parametros diferentes
        if (showLastName) {
            return fullName();
        } else {
            return firstName.toUpperCase();
        }
    }
}
