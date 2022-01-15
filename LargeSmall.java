package Looping;

import java.util.Scanner;

public class LargeSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
 char choice;
 int number;
 Scanner console=new Scanner(System.in);
 
 int count=1;
 do
 {
	 System.out.print("Enter the number");
	 number=console.nextInt();
	 if(count==1)
	 {
		 max=min=number;
		 if(number>max)
		 {
			 max=number;
			 
		 }
		 if (number < min)
		 {
			 min=number;
			 
		 }
	 }
	 System.out.print("Do you want to continue y/n?");
	 choice = console.next().charAt(0);
 }while(choice=='y' ||choice=='Y' );
	
	
	System.out.println(max);
	System.out.println(min);
}

}
