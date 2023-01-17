package com.monocept.test;

import java.util.*;

public class BookCricket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to start game and 0 to exit:");
		int choice=sc.nextInt();
		
		while(choice==1) {
			String player1;
			String player2;
			int turn1=0;
			int score1=0,score2=0;
			
			Random rand = new Random();
			
			System.out.println("Enter Player 1 name:");
			player1=sc.next();
			
			System.out.println("Enter Player 2 name:");
			player2=sc.next();
			
			System.out.println("Player: "+player1);
			while(true) {
				System.out.print("Enter 1 to open book: ");
				sc.nextInt();
				
				int pageNumber = (int) rand.nextInt(301);
				turn1++;
				score1+=pageNumber%7;
				
				System.out.println("Page Number: "+pageNumber+"         Point: "+pageNumber%7+"        Score: "+score1);
				
				if(pageNumber%7==0)
					break;
			}
			
			System.out.println(player1+" total score "+score1);
			System.out.println(player1+" takes "+turn1+" rounds");
			System.out.println(player2+" needs "+(score1+1)+" score in "+turn1+" rounds to win match");
			
			while(true) {
				System.out.print("Enter 1 to open book: ");
				sc.nextInt();
				int pageNumber = (int) rand.nextInt(301);
				score2 += pageNumber % 7;
				turn1--;
				System.out.println("Page Number: " + pageNumber + "         Point: " + pageNumber % 7
						+ "        Score: " + score2+"  rounds left: "+turn1);
				
				if(pageNumber%7==0)
					break;

				if (score2>score1) {
//					System.out.println(player2+" won the match");
					break;
				}
					
			}
			
			if(score1>score2) {
				System.out.println(player1+" won the match");
			}
			else if(score2>score1) {
				System.out.println(player2+" won the match");
			}
			else {
				if(turn1>0) {
					System.out.println(player2+" won the match");
				}
				else
				{
					System.out.println(player1+" won the match");
				}
			}
			
			System.out.println("Enter 1 to start game and 0 to exit:");
			choice=sc.nextInt();
			
		}
		

	}

}
