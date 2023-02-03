package com.monocept.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {

	private int playerPos;
	private String name;
	private ArrayList<Integer> playerPositions = new ArrayList<Integer>();
	public Player() {
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
	}
	public int getPlayerPos() {
		return playerPos;
	}
	public String getName() {
		return name;
	}
	public void setPlayerPos(ArrayList<Integer> opponentPosition) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your position (1-9): ");
		playerPos = sc.nextInt();
		while(playerPositions.contains(playerPos) || opponentPosition.contains(playerPos)) {
			System.out.println("Position Taken!! Enter valid Position:");
			playerPos = sc.nextInt();
		}
		playerPositions.add(playerPos);
	}
	public ArrayList<Integer> getPlayerPositions() {
		return playerPositions;
	}
	

}
