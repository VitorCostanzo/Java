import java.util.Arrays;
import java.util.Scanner;

public class Aula {

    public static void main(String[] args) {
        int[] numbersA = new int[]{1, 2, 3}; // aponta para uma nova referencia na memoria
        int[] numbersB = new int[]{1, 2, 3}; // aponta para uma nova referencia na memoria
        int[] numbersC = numbersA; // aponta numbersC para a mesma referencia de memoria de numbersA

        System.out.println(numbersA == numbersB); // Compara a referencia da memoria
        System.out.println(numbersA.equals(numbersB));
        System.out.println(numbersA + " " + numbersB);
        System.out.println(Arrays.equals(numbersA, numbersB)); // Compara o valor das arrays

        System.out.println(" ");

        System.out.println(numbersA == numbersC); // Compara a referencia da memoria
        System.out.println(numbersA.equals(numbersC));
        System.out.println(numbersA + " " + numbersC);
        System.out.println(Arrays.equals(numbersA, numbersC)); // Compara o valor das arrays
    }
}