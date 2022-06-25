package funcs;

import comodos.Banheiro;

import java.util.Random;

public class Randomize {
    public static void norepeat(int tasks, String[] tarefas){
        Random rdm = new Random();
        Integer[] jafoi = new Integer[5];
        boolean repete = false;
        for (int i =0; i < tasks; i++){
            int x = rdm.nextInt(5);
            for (int j = 0; j < i; j++){
                if (x == jafoi[j]){
                    repete = true;
                    break;
                }
            }
            if (repete){
                i--;
                repete = false;
            }
            else {
                jafoi[i] = x;
                System.out.println(tarefas[x]);
            }
        }
    }
}
