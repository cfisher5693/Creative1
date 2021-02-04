package View;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import Controller.GGInsertListener;
import Model.GuessingGame;

public class MainScreen {
	private JFrame window;
	private JTextArea display = new JTextArea();
	private GuessingGame guessingGame = new GuessingGame();
	private JTextField field = new JTextField("Enter a number between 0 and 100 here!");
	
	public MainScreen(JFrame window) {
		this.window = window;
		window.setTitle("Guessing Game");
	}

	public void init() {
		Container cp = window.getContentPane();
		var scrollPane = new JScrollPane(display, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setPreferredSize(new Dimension(500, 500));
		cp.add(BorderLayout.CENTER, scrollPane);
		var guessButton = new JButton("Guess!");
		guessButton.addActionListener(new GGInsertListener(this));
		JPanel panel = new JPanel();
		panel.add(field);
		panel.add(guessButton);
		cp.add(BorderLayout.SOUTH, panel);
	}

	public GuessingGame getGuessingGame() {
		return guessingGame;
	}

	public JTextArea getDisplay() {
		return display;
	}

	public JTextField getField() {
		return field;
	}
}
