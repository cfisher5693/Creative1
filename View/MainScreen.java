package View;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainScreen {
	private JFrame window;
	private JTextArea display = new JTextArea();
	
	public MainScreen(JFrame window) {
		this.window = window;
	}

	public void init() {
		Container cp = window.getContentPane();

	}
}
