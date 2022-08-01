package com.bridgelab.classroom;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
System.out.println("Enter the start number:");
int start = sc.nextInt();
sc.close();
System.out.println("enter the end number:");
int end = sc.nextInt();
sc.close();
for (int a = start; a <= end; a++)
{
	if( a%2 == 0);
	{
		System.out.println(a);
		sum = sum+a;
	}
}
System.out.println("total:"+sum);
	}
}
