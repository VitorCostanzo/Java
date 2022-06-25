package frames;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import frames.IntroFrame;

public class ShowContentFrame {

    public static JFrame scf = new JFrame("Mostrar");
    public static void openFrame(){

        // BOTAO VOLTAR
        JButton back = new JButton("Voltar");
        back.setBounds(450, 900, 100, 30);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IntroFrame.openFrame();
                scf.dispose();
            }
        });



        // FRAME
        scf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        scf.add(back);
        for (int i = 0; i < IntroFrame.info.size(); i++){
            IntroFrame.info.get(i).setBounds(30, (i * 20 + 10), 500, 30);
            scf.add(IntroFrame.info.get(i));
       }
        scf.setSize(1000, 1000);
        scf.setLayout(null);
        scf.setLocationRelativeTo(null);
        scf.setResizable(false);
        scf.setVisible(true);
    }
}