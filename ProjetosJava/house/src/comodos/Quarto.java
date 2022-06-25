package comodos;

import funcs.Randomize;

import java.util.Random;

public class Quarto {
    public static void quarto(int tasks){
                String[] tarefas = new String[5];
        tarefas[0] = "Arrumar a cama.";
        tarefas[1] = "Arrumar guarda-roupa.";
        tarefas[2] = "Passar aspirador.";
        tarefas[3] = "Organizar escrivaninha.";
        tarefas[4] = "Verificar filtro do ar condicionado.";
        Randomize.norepeat(tasks, tarefas);
    }
}
