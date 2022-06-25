public class User {
    private String firstName;
    private String lastName;
    public User(String firstName, String lastName){
        this.firstName = firstName.toUpperCase();
        this.lastName = lastName.toUpperCase();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName.toUpperCase();
    }

    public void setLastName(String lastName) {
        this.lastName = lastName.toUpperCase();
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String fullName(){
        return firstName + " " + lastName;
    }

    public String fullName(boolean showLastName){
        if (showLastName){
            return fullName();
        } else {
            return firstName;
        }
    }

    public String toString(){ // alterando o método .toString
        return "User: {firstName: " + firstName + ", lastName: " + lastName + "}";
    }
}
