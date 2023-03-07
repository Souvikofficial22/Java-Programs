package com.monocept.model;

public class Game {
	private Player currentPlayer;
	private Player[] players;
	public ResultAnalyzer analyzer;
	public Game(Player[] players) {
		super();
		this.players = players;
		analyzer = new ResultAnalyzer(new Board());
		currentPlayer = players[0];
	}
	
	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	public void setCurrentPlayer(Player currentPlayer) {
		this.currentPlayer = currentPlayer;
	}

	public Player[] getPlayers() {
		return players;
	}

	public void setPlayers(Player[] players) {
		this.players = players;
	}

	public ResultAnalyzer getAnalyzer() {
		return analyzer;
	}

	public void setAnalyzer(ResultAnalyzer analyzer) {
		this.analyzer = analyzer;
	}

	public void play(int loc) {
		analyzer.getBoard().setCellMark(loc, currentPlayer.getMark());
		
		ResultType result = analyzer.analyzeResult();
		if(result == ResultType.PROGRESS)
			switchPlayer();
		if(result == ResultType.WIN)
			System.out.println(currentPlayer.getName()+" Won!!!");
		if(result == ResultType.DRAW)
			System.out.println("Draw");
		
	}
	private void switchPlayer() {
		if(currentPlayer == players[0]) {
			currentPlayer = players[1];
			return;
		}
			currentPlayer = players[0];
	}
}
