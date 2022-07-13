package br.com.cursojava.layouts;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class MainFrame {

	private static JFrame mainFrame;
	private static JButton register;
	private static JButton cancel;
	private static JTextField nameEntry;
	private static JTextField loginEntry;
	private static JTextField pwdEntry;
	private static JLabel nameLabel;
	private static JLabel loginLabel;
	private static JLabel pwdLabel;
	
	public static void main(String[] args) {
		
		mainFrame = new JFrame("Cadastro Simples de Usuário");
		mainFrame.setSize(500, 400);
		mainFrame.setResizable(false);
		mainFrame.setDefaultCloseOperation(3);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setLayout(null);
		mainFrame.getContentPane().setBackground(Color.lightGray);
		
		
		nameLabel = new JLabel("Nome:");
		nameLabel.setBounds(120, 80, 100, 30);
		nameEntry = new JTextField();
		nameEntry.setFont(new Font("Calibri", 1, 15));
		nameEntry.setBounds(230, 80, 160, 30);
		
		
		loginLabel = new JLabel("Login:");
		loginLabel.setBounds(120, 140, 100, 30);
		loginEntry = new JTextField();
		loginEntry.setFont(new Font("Calibri", 1, 15));
		loginEntry.setBounds(230, 140, 160, 30);
		
		
		pwdLabel = new JLabel("Senha:");
		pwdLabel.setBounds(120, 200, 100, 30);
		pwdEntry = new JPasswordField();
		pwdEntry.setBounds(230, 200, 160, 30);
		
		
		register = new JButton("Cadastrar");
		register.setBounds(270, 300, 120, 30);
		register.setBackground(Color.darkGray);
		register.setBorder(new LineBorder(Color.green));
		register.setForeground(Color.lightGray);
		register.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				nameEntry.setText("");
				loginEntry.setText("");
				pwdEntry.setText("");
			}
		});

		
		cancel = new JButton("Cancelar");
		cancel.setBounds(100, 300, 120, 30);
		cancel.setBackground(Color.darkGray);
		cancel.setBorder(new LineBorder(Color.red));
		cancel.setForeground(Color.lightGray);
		cancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		
		mainFrame.add(nameLabel);
		mainFrame.add(nameEntry);
		mainFrame.add(loginLabel);
		mainFrame.add(loginEntry);
		mainFrame.add(pwdLabel);
		mainFrame.add(pwdEntry);
		mainFrame.add(cancel);
		mainFrame.add(register);
		mainFrame.setVisible(true);
		
	}
	
}
