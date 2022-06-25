public class City {
    private String name;
    private int population;
    private static int count = 0;

    public City(String name, int population){
        this.name = name.toUpperCase();
        this.population = population;
    }

    public void setName(String name) {
        this.name = name.toUpperCase();
    }
    public void setPopulation(int population){
        this.population = population;
    }
    public static void setCount() { // pertence à classe
        count = count + 1;
    }
    public String getName() {
        return name;
    }
    public int getPopulation(){
        return population;
    }
    public static int getCount(){ // static - pertence à classe
        return count;
    }
}
