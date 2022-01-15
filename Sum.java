package Looping;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,sum;
		char ch;
Scanner s1=new Scanner(System.in);
do
{
	System.out.println("Enter two no:");
	a=s1.nextInt();
	b=s1.nextInt();	
	sum=a+b;
	System.out.println(sum);
	System.out.println("Do you wish to continue?");
	String n1=s1.next();
	ch=n1.charAt(0);
	
}while(ch=='y' || ch=='Y');
	}

}
