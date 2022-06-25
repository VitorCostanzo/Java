import java.util.Random;
import java.util.Scanner;

public class NoRepeatRandom {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantos numeros aleatorios quer?  ");
        int quant = Integer.parseInt(entrada.nextLine());
        System.out.print("Qual o valor minimo?  ");
        int min = Integer.parseInt(entrada.nextLine());
        System.out.print("Qual o valor maximo?  ");
        int max = Integer.parseInt(entrada.nextLine());
        if (quant <= ((max + 1) - min)) {
            int rep = 0;
            while ((rep != 1) && (rep != 2)) {
                System.out.print("Habilitar repeticoes?  [1-sim, 2-nao]  ");
                rep = Integer.parseInt(entrada.nextLine());
                if ((rep != 1) && (rep != 2)) {
                    System.out.println("Selecione uma opcao valida !");
                }
            }
            if (rep == 1) {
                Random rdm = new Random();
                for (int i = 0; i < quant; i++){
                    System.out.println(rdm.nextInt(min, (max + 1)));
                }
            }
            else {
                Randomize.norepeat(quant,min,max);
            }
        } else {
            Random rdm = new Random();
            for (int i = 0; i < quant; i++){
                System.out.println(rdm.nextInt(min, (max + 1)));
            }
        }
    }
}
