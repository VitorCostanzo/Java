package app;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class Button {
	/** variáveis usadas em diferentes métodos **/
	private static List<JButton> button = new ArrayList<>();
	/** Lista que receberá os nomes dos botões descobertos **/
	private static Random rdm = new Random();
	/** para randomizar os nomes dos botões **/
	private static String clickname1;
	/** salvará temporariamente o nome do botão apertado para comparação **/
	private static String clickname2;
	public static int error = 0;
	private static int pares = 7;
	private static int count = 0;

	/** determina se já existe um botão apertado ou não **/

	public static void setButton() {

		List<String> name = createNames();
		createButtons(name);

	}

	public static List<String> createNames() {
		/** Lista de nomes dos botões (2 de cada) para comparação. **/
		List<String> name = new ArrayList<>();
		name.add("A");
		name.add("A");
		name.add("B");
		name.add("B");
		name.add("C");
		name.add("C");
		name.add("D");
		name.add("D");
		name.add("E");
		name.add("E");
		name.add("F");
		name.add("F");
		name.add("G");
		name.add("G");
		name.add("H");
		name.add("H");
		return name;
	}

	public static void onClick(JButton current) {
		if (count == 0) { /** count == 0 -> nenhum botão pressionado **/
			Button.changeColor(current);
			clickname1 = current.getName();/** salva temporariamente em clickname o nome do botão pressionado **/
			count = 1;/** 1 botão pressionado **/

		} else if (count == 1) {
			/** count == 1 -> 1 botão já pressionado **/
			if (current.getName().equals(clickname1)) {
				/** novo pressionado e anterior possuem o mesmo nome **/
				if (current.getBackground().equals(Color.GRAY) == false) {
					clickname1 = "";
					clickname2 = "";
					count = 0;
					changeColor(current);
				} else {
					changeColor(current);
					for (int i = 0; i < button.size(); i++) {
						if (button.get(i).getName().equals(clickname1)) {
							button.get(i).setEnabled(false);
						}
					}
					pares++;
					if (pares == 8) {
						
						JFrame finish = new JFrame("Fim deJogo !");
						JLabel congrats = new JLabel("Você finalizou com " + error + " erros !");
						JButton end = new JButton("Fechar");
						if (error == 1) {
							congrats.setText("Você finalizou com 1 erro !");
						}
						congrats.setBounds(40, 30, 250, 50);
						congrats.setForeground(Color.WHITE);

						JButton rank = new JButton("Ranking");
						rank.setBounds(170, 100, 100, 35);
						rank.setBackground(Color.lightGray);
						rank.setCursor(new Cursor(Cursor.HAND_CURSOR));
						rank.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent arg0) {
								
								JTextArea ta = new JTextArea();
								ArrayList<Jogador> players = new ArrayList<Jogador>();
								try (Scanner scan = new Scanner(new File("Arquivos/Scores.csv"))){
									while (scan.hasNextLine()) {
										String linha = scan.nextLine();
										try (Scanner data = new Scanner(linha)){
											data.useDelimiter(",");
											players.add(new Jogador(data.next(), data.next()));
										}
									}
									players.add(new Jogador(App.nomeJogador, error + " erros"));
									
									
									
									StringBuilder sbr = new StringBuilder();
									Collections.sort(players);
									players.forEach(player -> sbr.append(player.toString() + "\n"));
									ta.setText(sbr.toString());
								} catch (Exception exc) {
									exc.printStackTrace();
								}
								
								try (PrintWriter pw = new PrintWriter("Arquivos/Scores.csv")){
									Collections.sort(players);
									players.forEach(player -> {
										pw.println(player.nome + "," + player.pontuacao);
									});
								} catch (Exception exc) {
									exc.printStackTrace();
								}
								
								JScrollPane sp = new JScrollPane(ta);
								
								sp.setBounds(20, 20, 260, 250);
								sp.setEnabled(false);
								
								
								JFrame rankingFrame = new JFrame("Ranking");
								rankingFrame.setDefaultCloseOperation(3);
								rankingFrame.setSize(300, 400);
								rankingFrame.setResizable(false);
								rankingFrame.setLayout(null);
								rankingFrame.setLocationRelativeTo(finish);
								rankingFrame.getContentPane().setBackground(Color.black);
																
								JButton sair = new JButton("Sair");
								sair.setBounds(100, 310, 100, 35);
								sair.addActionListener(new ActionListener() {
									@Override
									public void actionPerformed(ActionEvent arg0) {
										System.exit(0);
									}
								});
								
								rankingFrame.add(sp);
								rankingFrame.add(sair);
								rankingFrame.setVisible(true);
								
								finish.dispose();
							}
						});
						
					
						end.setBounds(30, 100, 100, 35);
						end.setBackground(Color.lightGray);
						end.setCursor(new Cursor(Cursor.HAND_CURSOR));
						end.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								ArrayList<Jogador> ranking = new ArrayList<Jogador>();
								try (Scanner scan = new Scanner(new File("Arquivos/Scores.csv"))) {
									while (scan.hasNextLine()) {
										String row = scan.nextLine();
										try(Scanner data = new Scanner(row)) {
											data.useDelimiter(",");
											ranking.add(new Jogador(data.next(), data.next()));
										}
									}
																		
								} catch (Exception exc) {
									exc.printStackTrace();
								}
								
								try (PrintWriter pw = new PrintWriter("Arquivos/Scores.csv")){
									Collections.sort(ranking);
									ranking.forEach(player -> {
										pw.println(player.nome + "," + player.pontuacao);
									});
									pw.print(App.nomeJogador + "," + error + " erros");
								} catch (Exception exc) {
									exc.printStackTrace();
								}
								System.exit(1);
							}
						});

						
						finish.setLayout(null);
						finish.setSize(300, 200);
						finish.setLocationRelativeTo(App.memory);
						finish.setResizable(false);
						finish.getContentPane().setBackground(Color.BLACK);
						finish.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
						finish.add(congrats);
						finish.add(rank);
						finish.add(end);
						finish.setVisible(true);

						App.memory.dispose();
					}
					clickname1 = "";
					clickname2 = "";
					count = 0;
				}
			} else { /** novo pressionado e anterior possuem nomes diferentes **/

				clickname2 = current.getName();
				count = 2; /** Para o usuário ver as duas ultimas cores selecionadas até dar um click **/
				Button.changeColor(current);
				error++;
				App.errorCount.setText("Contador de erros: " + error);
			}
		} else {
			/** count == 2 -> dois botões diferentes pressionados **/
			for (int i = 0; i < button.size(); i++) {
				if ((button.get(i).getName().equals(clickname1)) || (button.get(i).getName().equals(clickname2))) {
					button.get(i).setBackground(Color.GRAY);
				}
			}
			count = 0;
			clickname1 = "";
			clickname2 = "";
		}
	}

	public static void changeColor(JButton current) {
		/**
		 * atribui a cor pelo nome do botão (2 de cada) no click, de (null) para
		 * colorido e vice-versa
		 **/
		if (current.getName().equals("A")) {
			if (current.getBackground().equals(Color.red)) {
				current.setBackground(Color.GRAY);
			} else {
				current.setBackground(Color.red);
			}
		} else if (current.getName().equals("B")) {
			if (current.getBackground().equals(Color.blue)) {
				current.setBackground(Color.GRAY);
			} else {
				current.setBackground(Color.blue);
			}
		} else if (current.getName().equals("C")) {
			if (current.getBackground().equals(Color.green)) {
				current.setBackground(Color.GRAY);
			} else {
				current.setBackground(Color.green);
			}
		} else if (current.getName().equals("D")) {
			if (current.getBackground().equals(Color.yellow)) {
				current.setBackground(Color.GRAY);
			} else {
				current.setBackground(Color.yellow);
			}
		} else if (current.getName().equals("E")) {
			if (current.getBackground().equals(Color.magenta)) {
				current.setBackground(Color.GRAY);
			} else {
				current.setBackground(Color.magenta);
			}
		} else if (current.getName().equals("F")) {
			if (current.getBackground().equals(Color.pink)) {
				current.setBackground(Color.GRAY);
			} else {
				current.setBackground(Color.pink);
			}
		} else if (current.getName().equals("G")) {
			if (current.getBackground().equals(Color.white)) {
				current.setBackground(Color.GRAY);
			} else {
				current.setBackground(Color.white);
			}
		} else {
			if (current.getBackground().equals(Color.cyan)) {
				current.setBackground(Color.GRAY);
			} else {
				current.setBackground(Color.cyan);
			}
		}
	}

	public static JButton getButton(int i) {
		return button.get(i);
	}

	public static void createButtons(List<String> name) {
		/** Criando e posicionando os 16 botões de pelo loop for **/
		for (int i = 0; i < 16; i++) {
			JButton current = new JButton();
			if (i < 4) {
				current.setBounds((100 * i + 17), 20, 90, 90);
			} else if (i < 8) {
				current.setBounds((100 * (i - 4) + 17), 120, 90, 90);
			} else if (i < 12) {
				current.setBounds((100 * (i - 8) + 17), 220, 90, 90);
			} else {
				current.setBounds((100 * (i - 12) + 17), 320, 90, 90);
			}
			current.setCursor(new Cursor(Cursor.HAND_CURSOR));
			current.setBorder(BorderFactory.createBevelBorder(0));
			current.setBackground(Color.GRAY);
			int index = rdm.nextInt(name.size());/**
													 * index recebe um numero aleatório, com limite igual ao tamanho da
													 * lista de nomes, menor a cada loop
													 **/
			current.setName(name.get(index));/** Iguala o nome do botão atual à string aleatória da lista name **/
			// current.setText(current.getName());/**p/ teste, dá a posição dos botoes
			// iguais por nome no jogo**/

			current.addActionListener(new ActionListener() {
				/** funcionalidade dos botões **/
				@Override
				public void actionPerformed(ActionEvent e) {
					onClick(current); /** Chama a função onClick com parâmetro 'JButton current' **/
				}
			});
			name.remove(index);/** Remove da lista de nomes o nome já utilizado, para evitar repetição **/
			button.add(current);/** Adiciona o botão criado à lista de botões que serão dispostos na tela **/
		}
	}
}