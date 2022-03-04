package org.cstatemnts;

public class Factorial {
	public static void main(String[] args) {
		int i,Fact=1;
		int num=6;
		for(i=1;i<=num;i++)
		{
			Fact=Fact*i;
		}
		System.out.println("Factorial of " +num+ "is" +Fact);
	}

}
