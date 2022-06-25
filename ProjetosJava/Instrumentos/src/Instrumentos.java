public class Instrumentos {

    private String type;
    private String brand;
    private String color;
    public Instrumentos(String type, String brand, String color){
        this.type = type.toUpperCase();
        this.brand = brand.toUpperCase();
        this.color = color.toUpperCase();
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor(){
        return color;
    }
}
