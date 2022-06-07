package com.logicalprogrma;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,rem,rev=0;
				Scanner sc=new Scanner(System.in);
						System.out.println("enter any number");
				 n =sc.nextInt();
				while(n!=0)
				{
					rem=n%10;
					rev=rev*10+rem;
					n=n/10;
				}
				System.out.println("reverse number is " + rev);
	}

}
