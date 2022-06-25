package comodos;

import funcs.Randomize;

import java.util.Random;

public class Dispensa {
    public static void dispensa(int tasks){
        String[] tarefas = new String[5];
        tarefas[0] = "Organizar dispensa.";
        tarefas[1] = "Descartar produtos vencidos.";
        tarefas[2] = "Fazer lista de mercado.";
        tarefas[3] = "Limpar a dispensa.";
        tarefas[4] = "Dedetizar.";
        Randomize.norepeat(tasks, tarefas);
    }
}
