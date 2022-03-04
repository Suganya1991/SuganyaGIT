package org.cstatemnts;

public class Fibonacci {
	public static void main(String[] args) {
		int n=100, firstterm=0, secondterm=1;
		System.out.println("Finoacci from 1 to 100 is" +n);
	
	while(firstterm<=n)
	{
	System.out.println(+firstterm);
	int nextterm=firstterm+secondterm;
	firstterm=secondterm;
	secondterm=nextterm;
	}

}
}