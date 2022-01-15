import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sf=new Scanner(System.in);
		int a,b,num1=1;
		a=sf.nextInt();
		b=sf.nextInt();
		for(int i=1;i<=b;i++)
		{
			num1=num1*a;
		}
		System.out.println(a+"^"+b+"="+num1);
	}
	}

