package Looping;

public class Print_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//write a program to print 10 numbers and calculate the sum of the numbers
		int i,sum=0;
		for(i=1;i<=10;i++)
		{
			System.out.println(i);	
			sum=sum+i;
		}
		System.out.println("Sum of natural numbers is"+" "+sum);
		
		
	}

}
