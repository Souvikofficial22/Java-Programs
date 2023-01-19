package com.monocept.test;

import java.util.*;

public class LongestSequence {

	public static void main(String[] args) {
		String sequence;
		System.out.println("Enter a sequence of 0 and 1:");
		Scanner sc = new Scanner(System.in);
		sequence = sc.next();

		System.out.println("The longest sequence of 1 is " + longestSequence(sequence));
	}

	private static int longestSequence(String str) {
		int leng = 0, count = 0;
		for (int i = 0; i < str.length(); i++) {
			count++;
			if (str.charAt(i) == '0')
				count = 0;
			leng = Math.max(leng, count);
		}

		leng = Math.max(leng, count);
		return leng;
	}

}
