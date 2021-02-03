package Test;

import java.util.Scanner;
import Model.GuessingGame;

public class TEST {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		GuessingGame g1 = new GuessingGame();
		int n = g1.getN();
		System.out.println("Guess a number between 1 and 100!");
		g1.guess(keyboard.nextInt());
		System.out.println(g1.check());
		System.out.println(n);
		keyboard.close();
	}
}
