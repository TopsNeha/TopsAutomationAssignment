package com.Assignment;

import java.util.Scanner;

/* 
 * W.A.J.P to check given number is Prime or not?
 */
public class PrimeNumber {
	public static void main(String[] args) {
		int num;
		boolean isprime=true;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number:");
		num=sc.nextInt();
		
		
		
		if(num<1) 
			System.out.println("num needs to greater than 1");
		
		else if (num==1)
			System.out.println("1 is neigher prime nor composite ");
		
	else {
		for (int i = 2; i <=(num/2); i++) {
			if((num%i)==0) {
				isprime=false;
				break;
				
			}
			
			
		}
		if(isprime)
			System.out.printf("%d is a prime",num);
		else 
			System.out.printf("%d is a not prime num",num);
		}
	}
		

		
		
	}


