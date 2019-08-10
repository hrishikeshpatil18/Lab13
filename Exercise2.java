package lab13;								//Write a method that uses lambda expression to format a given string, 
											//where a space is inserted between each character of string
import java.util.Scanner;
import java.util.function.Consumer;

interface Sample
{
	public String getString(String s);
}
public class Exercise2 
{
	public static void main(String args[])
	{
		Sample sam=(msg)->{
										String s=msg.replace(""," ");
										
										return s;
		};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.next();
		System.out.println(sam.getString(str));
		
	}
	
}
