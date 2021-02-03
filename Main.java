import javax.swing.JFrame;

import View.MainScreen;

public class Main {
	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		var mainScreen = new MainScreen(window);
		mainScreen.init();
		window.pack();
		window.setVisible(true);
	}
}