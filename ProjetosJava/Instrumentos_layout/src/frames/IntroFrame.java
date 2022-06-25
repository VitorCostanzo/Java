package frames;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import app.App;
import instrumentos.Instrumentos;

public class IntroFrame {
    public static JFrame introF = new JFrame("INSTRUMENTOS");
    public static List<JLabel> info = new ArrayList<>();

    public static void openFrame(){
        // BOTAO CADASTRAR
        JButton register = new JButton("Cadastrar");
        register.setBounds(40, 80, 100, 40);
        register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Register.openFrame();
                introF.dispose();
            }
        });

        // BOTAO MOSTRAR
        JButton show = new JButton("Mostrar");
        show.setBounds(150, 80, 100, 40);
        show.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                info.clear();
                for (int i = 0; i < App.instrumento.size(); i++){
                    JLabel current = new JLabel(App.instrumento.get(i).getFullInfo());
                    info.add(current);
                }
                ShowContentFrame.openFrame();
                introF.dispose();
            }
        });

        introF.add(register);
        introF.add(show);
        introF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        introF.setLayout(null);
        introF.setLocationRelativeTo(null);
        introF.setResizable(false);
        introF.setSize(300, 200);
        introF.setVisible(true);
    }
}