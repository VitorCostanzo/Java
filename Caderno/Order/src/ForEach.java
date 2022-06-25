import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Bauru");
        cities.add("Piracicaba");
        cities.add("Agudos");
        cities.add("Florianopolis");
        cities.add("Sao Paulo");
        cities.add("Rio de Janeiro");

        Collections.sort(cities); // Ordena uma lista
        System.out.println(cities);

        for (String city : cities){ //foreach retorna uma String city para cada elemento na lista cities
            System.out.print(" " + city);
        }
    }
}
