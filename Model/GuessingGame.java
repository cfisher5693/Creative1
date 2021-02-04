package Model;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessingGame {
	private int n;
	private int guess;
	private int constant;

	public GuessingGame() {
		n = ThreadLocalRandom.current().nextInt(0, 99 + 1);
		constant = 0;
	}

	public int getN() {
		return n;
	}

	public void guess() {
		Scanner key = new Scanner(System.in);
		while(constant == 0) {
			System.out.println("Guess a number between 0 and 100!");
			int g = key.nextInt();
			if(g <= 100 && g >= 0) {
				guess = g;
				break;
			}
			else {
				System.out.println("Invalid Entry!");
			}
		}
	}

	public void check() {
		if(guess == n) {
			System.out.println("Correct!");
		}
		if(guess > n) {
			System.out.println("Too high, try again!");
			guess();
			check();
		}
		if(guess < n) {
			System.out.println("Too low, try again!");
			guess();
			check();
		}
	}
}
