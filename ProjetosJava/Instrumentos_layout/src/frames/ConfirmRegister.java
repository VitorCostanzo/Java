package frames;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConfirmRegister {

    public static JFrame crf = new JFrame();

    public static void openFrame(){
        // BOTAO OK
        JButton back = new JButton("OK");
        back.setBounds(100, 120, 100, 20);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Register.rf.setEnabled(true);
                crf.dispose();
            }
        });

        // LABEL SUCESSO
        JLabel success = new JLabel("Cadastro realizado com sucesso!");
        success.setBounds(50, 20, 200, 30);

        crf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        crf.setSize(300, 200);
        crf.setLocationRelativeTo(null);
        crf.setLayout(null);
        crf.setResizable(false);
        crf.setVisible(true);
        crf.add(back);
        crf.add(success);
    }
}