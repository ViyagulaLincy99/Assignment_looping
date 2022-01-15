package Looping;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args)
{
	int fac=1,num,i,a,b,num1=1;
	Scanner scan=new Scanner(System.in);
	num=scan.nextInt();
	for(i=1;i<=num;i++)
	{
		fac=fac*i;
	}
	System.out.println(fac);
}
}
	