package com.monocept.test;

import com.monocept.model.TicTacToe;

public class TicTacToeTest {

	public static void main(String[] args) {
		TicTacToe obj = new TicTacToe();
		String winner = obj.startGame();
		
		if(winner.equalsIgnoreCase("draw")) {
			System.out.println("The Game is draw.");
		}
		else {
			System.out.println(winner+" won the game.");
		}
//		System.out.println(winner);
	}

}
