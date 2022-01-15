package Looping;

import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		boolean flag=true;
Scanner sa=new Scanner(System.in);
System.out.println("enter the number:");
num=sa.nextInt();
	for(int i=2;i<num;i++)
	{
		if(num%i==0)
		{
			flag=false;
			break;
		}
		
	}
	if(flag && num>1)
	{
		System.out.println("prime number");
		
	}
	else
	{
		System.out.println("not prime number");
	}
	}

}
