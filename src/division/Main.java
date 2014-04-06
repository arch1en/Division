package division;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;

import javax.swing.JFrame;

import division.input.KeyboardInput;
import division.input.MouseInput;

public class Main extends JFrame implements Runnable {

	public static int width = 160;
	public static int height = width / 4 * 3;
	public static int scale = 2;

	public static final String TITLE = "Division Component";
	public static final String VERSION = "0.0.0.1 Pre-Alpha";

	public static File filePath;

	Thread thread = new Thread(this, "App");
	KeyboardInput key = new KeyboardInput();
	MouseInput mouse = new MouseInput();
	Menu menu;
	MainComponent maincomp;
	MenuBottom menuBottom;

	public Main() {
		super("Division Component");
		addKeyListener(key);
		addMouseListener(mouse);
		setSize(width * scale, height * scale);
		//pack();
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);

		thread.start();
		menu = new Menu();
		//maincomp = new MainComponent();
		//menuBottom = new MenuBottom();
		add(menu, BorderLayout.NORTH);
		//add(maincomp, BorderLayout.CENTER);
		//add(menuBottom, BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				Main main = new Main();
			}
		});
	}

	@Override
	public void run() {
		while (true) {
			if (filePath != null) {
				maincomp = new MainComponent();
				add(maincomp, BorderLayout.CENTER);
				System.out.println("Added !");
				revalidate();
				System.out.println("Accepted");
				break;
			}
		}
	}

}
