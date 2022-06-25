package casa;

import comodos.*;

import java.util.Scanner;

public class House {

    public static void main(String[] args) {
        Scanner opcao = new Scanner(System.in);
        int op = 0;
        int tasks = 0;
        while ((op<1) || (op>5)) {
            System.out.println("Selecione o comodo da casa que deseja arrumar.\n[1-Sala, 2-Quarto, 3-Banheiro, 4-Cozinha, 5-Dispensa]");
            op = Integer.parseInt(opcao.nextLine());
            if ((op<1) || (op>5)){
                System.out.println("Selecione uma opcao valida!");
            }
        }
        while ((tasks<1) || (tasks>5)) {
            System.out.println("Selecione a quantidade de tarefas. [maximo 5]");
            tasks = Integer.parseInt(opcao.nextLine());
            if (tasks>5){
                System.out.println("NO MAXIMO 5 TAREFAS!");
            } else if (tasks<1) {
                System.out.println("PREGUICOSO!");
            }
        }

        if (op==1){
            Sala.sala(tasks);
        } else if (op==2) {
            Quarto.quarto(tasks);
        } else if (op==3) {
            Banheiro.banheiro(tasks);
        } else if (op==4) {
            Cozinha.cozinha(tasks);
        } else {
            Dispensa.dispensa(tasks);
        }
    }
}
