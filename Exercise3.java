package lab13;

import java.util.Scanner;


interface Validate
{
	public boolean getuser(String s1,String s2);
}
public class Exercise3 
{
	public static void main(String args[])
	{
		Validate sam=(s1,s2)->{
								String uname="Hrishikesh";
								String password="12345";
								if(s1.equals(uname) && s2.equals(password))
								{
									return true;
								}
			
								return false;
								
						};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username and passsword");
		String username=sc.next();
		String pswrd=sc.next();
		System.out.println(sam.getuser(username, pswrd));
		
		
	}
}
