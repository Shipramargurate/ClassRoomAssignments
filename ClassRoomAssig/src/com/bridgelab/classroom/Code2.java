package com.bridgelab.classroom;

import java.util.Scanner;

public class Code2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Star number:");
		int start = sc.nextInt();
		System.out.println("enter the end number:");
		int end = sc.nextInt();
		for (int a = start; a <= end; a++)
		{
			System.out.println(a);
		}

	}

}
