import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aula {

    public static void main(String[] args) {
        int num;
        String type, brand, color;

        List<Instrumentos> instrumento = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        System.out.print("Quantos instrumentos quer registrar? ");
        num = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < num; i++){
            System.out.print("\nTipo do " + (i+1) + "o. instrumento: ");
            type = scan.nextLine();
            System.out.print("Marca do " + (i+1) + "o. instrumento: ");
            brand = scan.nextLine();
            System.out.print("Cor do " + (i+1) + "o. instrumento: ");
            color = scan.nextLine();
            Instrumentos current = new Instrumentos(type, brand, color);
            instrumento.add(current);
        }

        System.out.println("\n\nSEUS INSTRUMENTOS\n");
        for (int i = 0; i < num; i++){
            System.out.print(instrumento.get(i).getType() + " ");
            System.out.print(instrumento.get(i).getBrand() + " ");
            System.out.println(instrumento.get(i).getColor());
        }
    }

}
