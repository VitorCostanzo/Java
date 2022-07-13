package mainpkg;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class App {

	public static void main(String[] args) {

		JFrame mainFrame = new JFrame("Jogo das perguntas");
		mainFrame.setSize(700, 750);
		mainFrame.setLayout(null);
		mainFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setResizable(false);
		
		JLabel question = new JLabel("1. Você é bobo?");
		question.setBounds(240, 200, 300, 100);
		question.setFont(new Font("Serif", Font.BOLD, 30));
		
		JButton sim = new JButton("Sim");
		sim.setBounds(400, 600, 120, 50);
		sim.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				JFrame eusabia = new JFrame("EU SABIA !");
				eusabia.setSize(200, 100);
				eusabia.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				eusabia.setLocationRelativeTo(mainFrame);

				JButton tchau = new JButton("Tchau");
				tchau.setFont(new Font("Serif", Font.BOLD, 20));
				tchau.setBounds(10, 10, 100, 50);
				tchau.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						System.exit(0);
					}

				});

				eusabia.add(tchau);
				eusabia.setVisible(true);

				mainFrame.dispose();

			}
		});

		JButton nao = new JButton("Não");
		nao.setBounds(200, 600, 120, 50);
		nao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Random rdmw = new Random();
				Random rdmh = new Random();
				
				nao.setLocation(rdmw.nextInt(0, 550), rdmh.nextInt(0, 650));
				
			}
		});

		mainFrame.add(question);
		mainFrame.add(nao);
		mainFrame.add(sim);
		mainFrame.setVisible(true);

	}

}
