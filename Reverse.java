package Looping;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,r,sum=0;
		Scanner s5=new Scanner(System.in);
		num=s5.nextInt();
		while(num!=0)
		{
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		System.out.println(sum);
	}

}
