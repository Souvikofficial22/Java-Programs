package com.monocept.test;

import com.monocept.model.PigDiceGame;

public class PigGameTest {

	public static void main(String[] args) {
		PigDiceGame obj = new PigDiceGame();
		String result=obj.startGame();
		
		if(result.equalsIgnoreCase("draw")) {
			System.out.println("Its a draw");
		}
		else {
			System.out.println(result+" won the game");
		}
	}

}
