import java.util.Random;

public class Randomize {
    public static void norepeat(int quant, int min, int max){
        Random rdm = new Random();
        Integer[] copy = new Integer[quant];
        boolean repeat = false;
        for (int i = 0; i < quant; i++){
            int x = rdm.nextInt(min, (max+1));
            for (int j = 0; j < i; j++){
                if (x == copy[j]){
                    repeat = true;
                    break;
                }
            }
            if (repeat){
                i--;
                repeat = false;
            } else {
                copy[i] = x;
                System.out.println(x);
            }
        }
    }
}
