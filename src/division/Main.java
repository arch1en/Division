package division;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import division.input.KeyboardInput;
import division.input.MouseInput;

public class Main extends JFrame {
	
	public static int width = 320;
	public static int height = width / 4 * 3;
	public static int scale = 2;
	
	public static final String TITLE = "Division Component";
	public static final String VERSION = "0.0.0.1 Pre-Alpha";
	
	KeyboardInput key = new KeyboardInput();
	MouseInput mouse = new MouseInput();
	
	public Main() {
		super("Division Component");
		addKeyListener(key);
		addMouseListener(mouse);
		setSize(width*scale, height*scale);
		//pack();
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				Main main = new Main();
				MainComponent maincomp = new MainComponent();
				Menu menu = new Menu();
				MenuBottom menuBottom = new MenuBottom();
				main.add(menu, BorderLayout.NORTH);
				main.add(maincomp, BorderLayout.CENTER);
				main.add(menuBottom, BorderLayout.SOUTH);
			}
		});
	}
	
}
