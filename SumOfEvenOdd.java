package Looping;

import java.util.Scanner;

public class SumOfEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int even=0,odd=0,a;
		char ch;
Scanner s2=new Scanner(System.in);
do
{
	System.out.println("enter the number:");
	a=s2.nextInt();
	if(a%2==0)
	{
			even=even+1;
		}
		else {
			odd=odd+1;
		}
	System.out.println("Do you wish to continue:");
	ch=s2.next().charAt(0);
}while(ch=='y' || ch=='Y');
System.out.println("sum of even is"+even);
System.out.println("sum of odd is"+odd);

}
}
