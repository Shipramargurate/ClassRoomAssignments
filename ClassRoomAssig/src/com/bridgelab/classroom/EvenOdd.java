package com.bridgelab.classroom;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner evenOdd = new Scanner (System.in);
		System.out.println("Enter teh start number:");
		int start = evenOdd.nextInt();
		System.out.println("Enter the end number:");
		int end = evenOdd.nextInt();
		int a = 0, b = 0;
		int aSum = 0, bSum = 0;
		System.out.println("even \t odd");
		
		for (int k = start; k <= end; k++)
		{
			if( k%2 != 0 )
			{
				a = k;
				aSum = aSum + a;
				b = a + 1;
				bSum = bSum + b;
				System.out.println("" +a+ "\t" +b+ "");
			}
			}
}
}
