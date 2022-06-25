package comodos;

import funcs.Randomize;

import java.util.Random;

public class Sala {
    public static void sala(int tasks) {
        String[] tarefas = new String[5];
        tarefas[0] = "Varrer a sala.";
        tarefas[1] = "Limpar o lustre.";
        tarefas[2] = "Tirar a poeira da tv.";
        tarefas[3] = "Tirar a poeira do tapete.";
        tarefas[4] = "Arrumar as almofadas.";
        Randomize.norepeat(tasks, tarefas);
    }
}
