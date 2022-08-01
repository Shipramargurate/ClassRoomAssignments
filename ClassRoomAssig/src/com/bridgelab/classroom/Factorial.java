package com.bridgelab.classroom;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int factnum = 1;
		System.out.println("enter the number:");
		int num = sc.nextInt();
		sc.close();
		for (int a = 1; a <= num; a++)
		{
			factnum = factnum*a;
			System.out.println("Factorial of "+num+ " is "+factnum);
					
		}

	}

}
