package com.monocept.test;

import java.util.Scanner;

import com.monocept.model.Board;
import com.monocept.model.Cell;
import com.monocept.model.Game;
import com.monocept.model.MarkType;
import com.monocept.model.Player;
import com.monocept.model.ResultAnalyzer;
import com.monocept.model.ResultType;

public class TicTacToeConsoleTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Tic-Tac-Toe Game");
		System.out.println("Enter name of Player 1 :");
		String playerOneName=sc.nextLine();
		System.out.println("Enter name of Player 2 :");
		String playerTwoName=sc.nextLine();
		Player[] players= {
			new Player(playerOneName,MarkType.X),
			new Player(playerTwoName,MarkType.O)
		};
		
		Game game=new Game(players);
		
		printBoard(game.getAnalyzer().getBoard());
		
		while (true){
			System.out.println("Player :"+" ("+game.getCurrentPlayer().getName()+")");
			System.out.println("Enter location number between 0-8 :");
			int loc=sc.nextInt();
			game.play(loc);
			printBoard(game.getAnalyzer().getBoard());
			if(game.getAnalyzer().getResult()!=ResultType.PROGRESS) {
				break;
			}
		}
	}

	private static void printBoard(Board board) {
		Cell[] cells=board.getCells();
		for(int i=0;i<9;i++) {
			String temp=cells[i].getMark()==MarkType.EMPTY?(i+""):cells[i].getMark().toString();
			System.out.print(temp+"  | ");
			if((i+1)%3==0) {
				System.out.println("\n--------------");
			}
		}
		
	}

}
