package com.bridgelab.classroom;

public class DivisibleBy3and5 {
static void result (int n)
{
	for (int num = 0; num < n; num++)
	{
		if(num % 3 == 0 && num % 5 == 0)
			System.out.println(num);
	}
}
	public static void main(String[] args) {
		int n = 50;
		result (n);

	}

}
