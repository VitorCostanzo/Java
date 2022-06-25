import java.util.Random;
import java.util.Scanner;

public class gerador {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("RANDOMIZADOR DE NUMEROS");
        System.out.print("\nDigite o valor minimo: ");
        int min = Integer.parseInt(scanner.nextLine());
        System.out.print("\nDigite o valor maximo: ");
        int max = Integer.parseInt(scanner.nextLine());
        System.out.print("\n\nQuantos numeros? ");
        int quant = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < quant; i++){
            int number;
            number = rand.nextInt(min,(max + 1));
            System.out.print(number + "  ");
        }

    }
}
