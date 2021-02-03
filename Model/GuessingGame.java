package Model;

import java.util.concurrent.ThreadLocalRandom;

public class GuessingGame {
	private int n;
	private int guess;

	public GuessingGame() {
		n = ThreadLocalRandom.current().nextInt(0, 99 + 1);
	}

	public int getN() {
		return n;
	}

	public void guess(int g) {
		if(g <= 100 && g >= 0) {
			guess = g;
		}
		else {
			System.out.println("Invalid Entry!");
		}
	}

	public String check() {
		String str = "";
		if(guess == n) {
			str = "Correct!";
		}
		if(guess > n) {
			str = "Too high!";
		}
		if(guess < n) {
			str = "Too low!";
		}
		return str;
	}
}
