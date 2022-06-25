import java.util.Arrays;
import java.util.Scanner;

public class Aula {

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 60, 17, 4, 45, 3, 68, 19, 33, 22};
        Arrays.sort(numbers); // Ordena os elementos da array

        for (int i = 0; i < numbers.length; i++){ // metodo loop
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\n\n" + Arrays.toString(numbers)); // função toString

        // OBS:
        System.out.println("\n" + numbers); // Imprime o hashcode (identificador)
    }
}