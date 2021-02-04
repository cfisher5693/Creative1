package Test;

import Model.GuessingGame;

public class TEST {
	public static void main(String[] args) {
		GuessingGame g1 = new GuessingGame();
		int n = g1.getN();
		g1.guess();
		g1.check();
		System.out.println(n);
	}
}
