package com.bridgelab.classroom;

import java.util.Scanner;

public class Code1 {

	public static void main(String[] args) {
		int table;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		sc.close();
		for (int a = 1; a <= 10; a++ )
		{
			table=num*a;
System.out.println(table);			
		}

	}

}
