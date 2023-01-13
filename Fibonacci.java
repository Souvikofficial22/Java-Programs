package com.monocept.test;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		
		Fibo(num);
	}
	
	public static void Fibo(int num)
	{
		int a=0,b=1,c;
		System.out.println("The Fibonacci series of "+num+" numbers are :");
		for(int i=0;i<num;i++)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
			
		}
	}
}
