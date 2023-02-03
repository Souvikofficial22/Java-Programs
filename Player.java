package com.monocept.model;

public class Player {
	private int totalScore;
	private int turns;
	private String name;
	
	public Player(String name) {
//		super();
		this.totalScore = 0;
		this.turns = 0;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}
	public int getTurns() {
		return turns;
	}
	public void setTurns(int turns) {
		this.turns = turns;
	}
	
}
