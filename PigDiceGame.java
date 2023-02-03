package com.monocept.model;

import java.util.Scanner;

public class PigDiceGame {
	Scanner sc = new Scanner(System.in);

	public String startGame() {

		String name;
		System.out.println("Enter player1 name: ");
		name = sc.nextLine();

		Player p1 = new Player(name);

		System.out.println("Enter player2 name: ");
		name = sc.nextLine();

		Player p2 = new Player(name);

		playGame(p1);
		playGame(p2);

		if (p1.getTurns() < p2.getTurns()) {
			return p1.getName();
		}
		if (p2.getTurns() < p1.getTurns()) {
			return p2.getName();
		}
		return "Draw";
	}

	private void playGame(Player p) {
		System.out.println(p.getName()+" is playing");
		while (p.getTotalScore() < 20) {
			p.setTurns(p.getTurns() + 1);
			System.out.println("Turn: " + p.getTurns());
			int turnScore = 0;
			char ch;
			while (true) {
				System.out.print("Roll or Hold?(r/h): ");
				ch = sc.next().charAt(0);
				if (ch == 'r') {
					int die = (int) (Math.random() * 6) + 1;

					System.out.println("Die: " + die);

					if (die == 1) {
						System.out.println("Turn over. No Score");
						break;
					}

					turnScore += die;
					if (p.getTotalScore() + turnScore >= 20) {
						p.setTotalScore(p.getTotalScore() + turnScore);
						System.out.println("Score for the turn " + turnScore);
						System.out.println("Total Score: " + p.getTotalScore());
						System.out.println("Total turns taken: "+p.getTurns());
						break;
					}
				} else {
					p.setTotalScore(p.getTotalScore() + turnScore);
					System.out.println("Score for the turn " + turnScore);
					System.out.println("Total Score: " + p.getTotalScore());
					break;
				}
			}
		}
	}
}
