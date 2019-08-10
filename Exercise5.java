package lab13;						//calculate Factorial using lambda expression

import java.util.Scanner;

interface Factorial
{
	public int fact(int i);
}

class Fact
{
	static public int getfact(int num)
	{
		int result=1;
		for(int i=num;i>0;i--)
			result=result*i;
		return result;
	}
}

public class Exercise5 
{

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num1=sc.nextInt();
		
		Factorial f=Fact::getfact;
			System.out.println(f.fact(num1));
			
		
	}
}
