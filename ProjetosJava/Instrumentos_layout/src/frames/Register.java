package frames;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import instrumentos.Instrumentos;
import app.App;

public class Register {

    public static JFrame rf = new JFrame("CADASTRO");
    public static void openFrame() {

        // LABEL TIPO

        JLabel typeLbl = new JLabel("Tipo:");
        typeLbl.setBounds(10, 30, 50, 30);

        // ENTRADA TIPO
        JTextField typeEnt = new JTextField();
        typeEnt.setBounds(70, 30, 100, 30);

        // LABEL MARCA
        JLabel brandLbl = new JLabel("Marca:");
        brandLbl.setBounds(10, 80, 50, 30);

        // ENTRADA MARCA
        JTextField brandEnt = new JTextField();
        brandEnt.setBounds(70, 80, 100, 30);

        // LABEL COR
        JLabel colorLbl = new JLabel("Cor:");
        colorLbl.setBounds(10, 130, 50, 30);

        // ENTRADA COR
        JTextField colorEnt = new JTextField();
        colorEnt.setBounds(70, 130, 100, 30);

        // BOTAO CADASTRAR
        JButton register = new JButton("Cadastrar"); // cria o botão
        register.setBounds(30, 220, 100, 30); // tamanho e posição
        register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (typeEnt.getText().isBlank() || brandEnt.getText().isBlank() || colorEnt.getText().isBlank()) {
                    JFrame erro = new JFrame();
                    erro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    erro.setSize(300, 200);
                    erro.setLayout(null);
                    erro.setLocationRelativeTo(null);

                    // BOTAO OK
                    JButton ok = new JButton("OK");
                    ok.setBounds(100, 100, 80, 30);
                    ok.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            rf.setEnabled(true);
                            erro.dispose();
                        }
                    });

                    // LABEL ERRO
                    JLabel error = new JLabel("Preencha todos os campos!");
                    error.setBounds(60, 20, 200, 30);

                    erro.add(ok);
                    erro.add(error);
                    erro.setVisible(true);
                    rf.setEnabled(false);
                } else {
                    String type = typeEnt.getText();
                    String brand = brandEnt.getText();
                    String color = colorEnt.getText();
                    Instrumentos current = new Instrumentos(type, brand, color);
                    App.instrumento.add(current);
                    typeEnt.setText("");
                    brandEnt.setText("");
                    colorEnt.setText("");
                    rf.setEnabled(false);
                    ConfirmRegister.openFrame();
                }
            }
        });

        // BOTAO VOLTAR
        JButton back = new JButton("Voltar"); // cria o botão
        back.setBounds(150, 220, 100, 30); // tamanho e posição
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frames.IntroFrame.openFrame();
                rf.dispose();
            }
        });

        // FRAME
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // fecha a aplicação quando fecha a janela
        rf.add(typeLbl);
        rf.add(typeEnt);
        rf.add(brandLbl);
        rf.add(brandEnt);
        rf.add(colorLbl);
        rf.add(colorEnt);
        rf.add(register);
        rf.add(back); // adiciona o botao ao frame
        rf.setSize(300, 300); // tamanho do frame
        rf.setLayout(null); // sem layout padrão
        rf.setLocationRelativeTo(null); // inicia o frame no centro da tela
        rf.setResizable(false); // não permite alterar o tamanho do frame
        rf.setVisible(true); // mostra o frame
    }

}