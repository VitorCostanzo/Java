import java.util.Scanner;

public class calc {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in); // objeto Scanner permite interação do usuário
        int op = 0;
        while ((op < 1) || (op > 4)) { // só sai do loop quando o usuario digitar uma opção válida
            System.out.println("Escolha uma operacao");
            System.out.print("[1:soma - 2:subtracao - 3:multiplicacao - 4:divisao]");
            op = Integer.parseInt(entry.nextLine());
            if ((op < 1) || (op > 4)) {
                System.out.println("opcao invalida");
            }
        }
        System.out.print("primeiro valor: ");
        int a = Integer.parseInt(entry.nextLine());
        System.out.print("segundo valor: ");
        int b = Integer.parseInt(entry.nextLine());
        if (op == 1){
            sum(a, b);
        } else if (op == 2){
            sub(a, b);
        } else if (op == 3){
            mult(a, b);
        } else {
            div(a, b);
        }
    }

    static void sum(int x, int y) { System.out.println("\nA soma e " + (x+y)); }
    static void sub(int x, int y){ System.out.println("\nO resto e " + (x-y)); }
    static void mult(int x, int y){ System.out.println("\nO produto e " + (x*y)); }
    static void div(int x, int y){ System.out.println("\nO quociente e " + (x/y)); }
}
