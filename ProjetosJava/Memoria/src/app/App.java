package app;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
	public static JLabel errorCount = new JLabel("Contador de erros: " + Button.error);
	public static JFrame memory = new JFrame("JOGO DA MEMORIA");
	public static JFrame hello = new JFrame("Digite seu nome!");
	public static JTextField nomeEntry = new JTextField();
	public static JButton comecar = new JButton("Começar!");
	public static String nomeJogador;

	public static void main(String[] args) {
		/** Chama o método que cria os botões **/
		Button.setButton();

		errorCount.setBounds(10, 435, 400, 40);
		errorCount.setForeground(Color.WHITE);

		/** Cria o frame inicial **/
		hello.setDefaultCloseOperation(3);
		hello.setLocationRelativeTo(null);
		hello.setResizable(false);
		hello.setLayout(null);
		hello.setSize(300, 150);
		hello.getContentPane().setBackground(Color.black);

		
		nomeEntry.setBounds(75, 15, 150, 30);
		nomeEntry.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent arg0) {
				if (nomeEntry.getText().isEmpty()) {
					comecar.setEnabled(false);
				} else {
					comecar.setEnabled(true);
				}
			}	
			@Override
			public void insertUpdate(DocumentEvent arg0) {
				if (nomeEntry.getText().isEmpty()) {
					comecar.setEnabled(false);
				} else {
					comecar.setEnabled(true);
				}
			}
			@Override
			public void changedUpdate(DocumentEvent arg0) {
				if (nomeEntry.getText().isEmpty()) {
					comecar.setEnabled(false);
				} else {
					comecar.setEnabled(true);
				}
			}
		});

		comecar.setBounds(75, 60, 150, 40);
		comecar.setEnabled(false);
		comecar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				/** Cria o Frame principal **/
				memory.setLocation(700, 400);
				memory.setLayout(null);
				memory.setResizable(false);
				memory.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				memory.setSize(425, 520);
				/** Adiciona todos os elementos da lista Button.button no frame **/
				for (int i = 0; i < 16; i++) {
					memory.add(Button.getButton(i));
				}
				memory.add(errorCount);
				memory.getContentPane().setBackground(Color.BLACK);
				memory.setVisible(true);

				nomeJogador = nomeEntry.getText();

				hello.dispose();

			}
		});

		hello.add(nomeEntry);
		hello.add(comecar);
		hello.setVisible(true);

	}
}