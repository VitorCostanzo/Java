package negocio;

public class Veiculo {
    private String name;
    private String brand;

    public Veiculo(String name, String  brand){
        this.name = name;
        this. brand = brand;
    }
    public Veiculo(){

    }
    public void setName(String name){
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }
}
