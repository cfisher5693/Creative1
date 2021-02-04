package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.MainScreen;

public class GGInsertListener implements ActionListener {
	private MainScreen panel;
	private int count;
	public GGInsertListener(MainScreen panel) {
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		String m = panel.getDisplay().getText() + "\n";
		try {
			int guess = Integer.parseInt(panel.getField().getText());
			String str = panel.getGuessingGame().GnC(guess);
			panel.getDisplay().setText(m + guess + " is " + str);
			if(str == "correct!") {
				panel.getDisplay().setText(m + guess + " is " + str + " You guessed correctly after " + count + " tries.");
			}
			panel.getField().setText("");
		} catch (NumberFormatException ex) {
			panel.getDisplay().setText(m + panel.getField().getText() + " is not a number, try again!");
			panel.getField().setText("");
		}
	}
}
