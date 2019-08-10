package lab13;								//Write a lambda expression which accepts x and y numbers and return xy. 
import java.util.function.*;

interface Power
{
	int getPower(int n1,int n2);
}
public class Exercise1 
{
	public static void main(String args[])
	{
		Power p=(num1,num2)->{
								int result=1;
								for(int i=0;i<num2;i++)
									{
										result=result*num1;
									}
									return result;	
								};
		System.out.println(+p.getPower(2, 3));
	}

}
