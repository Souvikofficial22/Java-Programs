package com.monocept.test;

import java.util.Arrays;

public class ArrayStatics {
	public static void main(String args[]) {
		int arr[]=new int[args.length];
		int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,sum=0;
		for(int i=0;i<args.length;i++) {
			arr[i]=Integer.parseInt(args[i]);
			
			min=Math.min(min, arr[i]);
			max=Math.max(max, arr[i]);
			
			sum+=arr[i];
		}
		
		int frequency[]=new int[max+1];
		
		Arrays.fill(frequency, 0);
		
		for(int i=0;i<arr.length;i++) {
			frequency[arr[i]]++;
		}
		
		Arrays.sort(arr);
		
		double median;
		
		if(arr.length%2==0) {
			median = (arr[arr.length/2]+arr[arr.length/2-1])/2.0;
		}
		else
		{
			median =arr[arr.length/2];
		}
		
		System.out.println("The sum of the elements of the array: "+sum);
		System.out.println("The average of the elements: "+((double)sum)/arr.length);
		System.out.println("The maximum element is: "+max);
		System.out.println("The minimum element is: "+min);
		System.out.println("The median is: "+median);
		
		System.out.println("Element Frequency");
		for(int i=0;i<frequency.length;i++)
		{
			if(frequency[i]>0) {
				System.out.println(i+"          "+frequency[i]);
			}
		}
		
	}
}
