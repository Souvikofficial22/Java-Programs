package com.monocept.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicTacToe {

	private String result;
	private char[][] gameBoard = {{' ','|',' ','|',' '},
								  {'-','+','-','+','-'},
								  {' ','|',' ','|',' '},
								  {'-','+','-','+','-'},
								  {' ','|',' ','|',' '}};
	private List<List> winningPos = new ArrayList<List>();
	
	
	
	public String startGame() {
		System.out.println("Welcome to TicTacToe Game");
		setWinningPos();
		printBoard();
		System.out.println("Enter Player1 Name: ");
		Player player1 = new Player();
		System.out.println("Enter Player2 Name: ");
		Player player2= new Player();
		int count=0;
		while(true) {
			if(count%2==0) {
				playGame(player1,player2,'X');
			}else {
				playGame(player2,player1,'O');
			}
			if(result.length()>0) {
				return result;
			}
			
			if(player1.getPlayerPositions().size()+player2.getPlayerPositions().size()==9) {
				return "draw";
			}
			count++;
		}
	}
	private void playGame(Player p1,Player p2,char ch) {
		System.out.println(p1.getName()+"'s turn");
		p1.setPlayerPos(p2.getPlayerPositions());
		System.out.println(p1.getName()+" selected position: "+p1.getPlayerPos());
		placeMark(p1.getPlayerPos(),ch);
		printBoard();
		result = checkWinner(p1);
	}
	
	private void setWinningPos() {
		winningPos.add(Arrays.asList(1,2,3));
		winningPos.add(Arrays.asList(4,5,6));
		winningPos.add(Arrays.asList(7,8,9));
		winningPos.add(Arrays.asList(1,4,7));
		winningPos.add(Arrays.asList(2,5,8));
		winningPos.add(Arrays.asList(3,6,9));
		winningPos.add(Arrays.asList(1,5,9));
		winningPos.add(Arrays.asList(3,5,7));
	}

	private String checkWinner(Player p) {
		for(List x : winningPos) {
			if(p.getPlayerPositions().containsAll(x)) {
				return p.getName();
			}
		}
		return "";
	}

	private void placeMark(int pos,char ch) {
		char marker= ch;
		switch(pos) {
		case 1: gameBoard[0][0] = marker;
				break;
		case 2: gameBoard[0][2] = marker;
		break;
		case 3: gameBoard[0][4] = marker;
		break;
		case 4: gameBoard[2][0] = marker;
		break;
		case 5: gameBoard[2][2] = marker;
		break;
		case 6: gameBoard[2][4] = marker;
		break;
		case 7: gameBoard[4][0] = marker;
		break;
		case 8: gameBoard[4][2] = marker;
		break;
		case 9: gameBoard[4][4] = marker;
		break;
		default: break;
		}
	}

	private void printBoard() {
		for(char[] rows : gameBoard) {
			for(char col : rows) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

}
