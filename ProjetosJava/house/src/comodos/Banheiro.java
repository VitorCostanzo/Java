package comodos;

import funcs.Randomize;

import java.util.Random;

public class Banheiro {
    public static void banheiro(int tasks){
        String[] tarefas = new String[5];
        tarefas[0] = "Lavar privada.";
        tarefas[1] = "Lavar box.";
        tarefas[2] = "Tirar o lixo.";
        tarefas[3] = "Desentupir os ralos.";
        tarefas[4] = "Reabastecer gavetas da pia.";
        Randomize.norepeat(tasks, tarefas);
    }
}
