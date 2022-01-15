package Looping;

import java.util.Scanner;

public class Hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dividend,divisor,remainder,hcf=0;
		Scanner se=new Scanner(System.in);
		divisor=se.nextInt();
		dividend=se.nextInt();
		do
		{
			remainder=dividend % divisor;
			if(remainder==0)
			{
				hcf=divisor;
			}
			else
			{
				dividend=divisor;
				divisor=remainder;
			}
		}while(remainder!=0);
	System.out.println("hcf:"+hcf);

	}

}
