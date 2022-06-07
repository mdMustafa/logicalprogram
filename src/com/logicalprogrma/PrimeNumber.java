package com.logicalprogrma;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the any number");
		int n = sc.nextInt();
		int temp = 0;
		for(int i = 0;i<=n-1;i++)
		{
 			if(n%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp>0)
		{
			System.out.println(n+"is prime no");
		}
		else
		{
			System.out.println(n+"is not prime");
		}
	}

}
