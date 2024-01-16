import java.util.Scanner;
import java.util.InputMismatchException;

class Exception_InputMisMatch
{

public static void main(String args[])
{

Scanner sc=new Scanner(System.in);

	try
	{
	System.out.println("Enter value of a to get its squar");
	Integer a=sc.nextInt();

	System.out.println((a*a));

	}

		catch(Exception e)
		{
		System.out.println(e);
		}

}
}

