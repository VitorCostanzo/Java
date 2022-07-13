package app;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class App {

	public static int contaFuga = 0;
	public static int contaClick = 0;
	public static JFrame mainFrame = new JFrame("Quem cansa primeiro?");

	public static void main(String[] args) {

		Random rdmx = new Random();
		Random rdmy = new Random();

		mainFrame.setLayout(null);
		mainFrame.setDefaultCloseOperation(0);
		mainFrame.setResizable(false);
		mainFrame.setSize(500, 500);

		JButton fujao = new JButton();
		fujao.setBounds(230, 230, 20, 20);
		fujao.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if (contaFuga < 4) {
					contaFuga++;
					fujao.setBackground(Color.decode(Cores.COR1.getRgb()));
					// System.out.println(contaFuga);
					fujao.setLocation(rdmx.nextInt(470), rdmy.nextInt(450));
				} else if (contaFuga < 8) {
					contaFuga++;
					fujao.setBackground(Color.decode(Cores.COR2.getRgb()));
					// System.out.println(contaFuga);
					fujao.setLocation(rdmx.nextInt(470), rdmy.nextInt(450));
				} else if (contaFuga < 12) {
					contaFuga++;
					fujao.setBackground(Color.decode(Cores.COR3.getRgb()));
					// System.out.println(contaFuga);
					fujao.setLocation(rdmx.nextInt(470), rdmy.nextInt(450));
				} else if (contaFuga < 16) {
					contaFuga++;
					fujao.setBackground(Color.decode(Cores.COR4.getRgb()));
					// System.out.println(contaFuga);
					fujao.setLocation(rdmx.nextInt(470), rdmy.nextInt(450));
				} else if (contaFuga < 20) {
					contaFuga++;
					fujao.setBackground(Color.decode(Cores.COR5.getRgb()));
					// System.out.println(contaFuga);
					fujao.setLocation(rdmx.nextInt(470), rdmy.nextInt(450));
				}
			}
		});
		fujao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});

		mainFrame.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				contaFuga = 0;
				contaClick++;
				if (contaClick > 15) {
					mainFrame.setTitle("Quem cansa primeiro? (N�o cansou de clicar?)");
				}
			}
		});
		mainFrame.add(fujao);
		mainFrame.setVisible(true);

	}

}
