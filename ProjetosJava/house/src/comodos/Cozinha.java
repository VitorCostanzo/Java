package comodos;

import funcs.Randomize;

import java.util.Random;

public class Cozinha {
    public static void cozinha(int tasks){
        String[] tarefas = new String[5];
        tarefas[0] = "Lavar louça.";
        tarefas[1] = "Preparar comida.";
        tarefas[2] = "Organizar louca.";
        tarefas[3] = "Encher galao de agua.";
        tarefas[4] = "Limpar azuleijos.";
        Randomize.norepeat(tasks,tarefas);
    }
}
