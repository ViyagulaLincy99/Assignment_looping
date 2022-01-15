package Looping;

import java.util.Scanner;

public class PosNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num,count=0,count1=0,d=0;
char choice;
Scanner sd=new Scanner(System.in);
do
{
System.out.println("enter the number");
num=sd.nextInt();
if(num>0)
{
	count=count+1;
}
else if(num<0)
{
	count1=count1+1;
}
else
{
	d=d+1;
}
System.out.println("Do you wish to continue:");
choice=sd.next().charAt(0);
}while(choice=='y' || choice=='Y');
System.out.println("Pos number is"+count);
System.out.println("neg number is"+count1);
System.out.println("zeros is"+d);

	}

}
