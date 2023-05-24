package com.Assignment;

import java.util.Scanner;

public class AverageOfArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many element you want:");
		
		int n=sc.nextInt();
		
		double[]array=new double[n];
		System.out.println("enter"+n+"elements in an array:");
		double sum=0;
		for (int i = 0; i < n; i++) {
			array[i]=sc.nextDouble();
			
			sum+=array[i];
			
		}
		System.out.println("Average is:"+sum/n);
	}

}
