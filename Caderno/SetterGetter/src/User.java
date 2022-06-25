public class User {

    // Como boa pratica da programação, cria-se propriedades privadas.
    private String firstName;
    private String lastName;

    // Para poder alterar as propriedades privadas, cria-se métodos públicos.
    // OBS: void nao retorna nada, simplesmente faz sua função.
    public void setFirstName(String firstName){ // recebe a string firstname como parametro e transforma em letras maiusculas.
        this.firstName = firstName.toUpperCase(); // this -> acessa propriedades desta classe.
    }
    // OBS: Função String, deve retornar uma string.
    public String getFirstName() { // retorna o firstname alterado
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName.toUpperCase();
    }

    public String getLastName(){
        return lastName;
    }

}
