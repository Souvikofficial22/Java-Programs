package com.monocept.test;

import java.util.*;

public class Prime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		
		if(isPrime(num))
			System.out.println(num+" is a Prime number");
		else
			System.out.println(num+" is not a Prime number");

	}
	
	public static boolean isPrime(int num) {
		
		boolean flag = true;
		
		for(int i=2;i<Math.sqrt(num);i++)
		{
			if(num%i==0)
			{
				flag = false;
				break;
			}
		}
		
		if(!flag)
			return false;
		return true;
	}

}
