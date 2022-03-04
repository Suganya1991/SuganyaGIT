package org.cstatemnts;
import java.util.Scanner;
public class Armstrong {
	public static void main(String[] args) {
		int num,number,temp,tot=0;
		System.out.println("Enter the three digit number");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		s.close();
		number=num;
		for(;num!=0; num /=10)
		{
			temp=number % 10;
			tot=tot+temp*temp*temp;
			
		}
		if(tot==num)
		{
			System.out.println(num+ "is an amstrong number");
		}
		else
		{
			System.out.println(num+ "is not an amstrong number");
		}
	}

}
