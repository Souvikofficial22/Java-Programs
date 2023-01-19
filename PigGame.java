package com.monocept.test;

import java.util.*;

public class PigGame {

	public static void main(String[] args) {
		int turn = 0;
		int totScore = 0;
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		while (totScore < 20) {
			turn++;
			System.out.println("Turn: " + turn);
			int turnScore = 0;
			char ch;
			while (true) {
				System.out.print("Roll or Hold?(r/h): ");
				ch = sc.next().charAt(0);
				if (ch == 'r') {
					int die = (int) rand.nextInt(7);

					System.out.println("Die: " + die);

					if (die == 1) {
						System.out.println("Turn over. No Score");
						break;
					}

					turnScore += die;
				} else {
					totScore += turnScore;
					System.out.println("Score for the turn " + turnScore);
					System.out.println("Total Score: " + totScore);
					break;
				}
			}

		}
		System.out.println("You finished in " + turn + " turns");
		System.out.println("Game over");

	}

}
