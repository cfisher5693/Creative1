package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import View.MainScreen;

public class GGInsertListener implements ActionListener {
	private MainScreen panel;
	public GGInsertListener(MainScreen panel) {
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Guess");
	}
	
}
