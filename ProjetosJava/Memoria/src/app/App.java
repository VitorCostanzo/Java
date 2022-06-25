package app;

import javax.swing.*;
import java.awt.*;

public class App {
    public static JLabel errorCount = new JLabel("Contador de erros: " + Button.error);
    public static JFrame memory = new JFrame("JOGO DA MEMORIA");
    public static void main(String[] args) {
        /**Chama o método que cria os botões**/
        Button.setButton();

        errorCount.setBounds(10, 435, 400, 40);
        errorCount.setForeground(Color.WHITE);

        /**Cria o Frame principal**/
        memory.setLocation(750, 300);
        memory.setLayout(null);
        memory.setResizable(false);
        memory.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        memory.setSize(425, 520);
        /**Adiciona todos os elementos da lista Button.button no frame**/
        for (int i = 0; i < 16; i++){
            memory.add(Button.getButton(i));
        }
        memory.add(errorCount);
        memory.getContentPane().setBackground(Color.BLACK);
        memory.setVisible(true);
    }
}