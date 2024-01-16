import java.util.Scanner;

class Exceptions_NullPointer
{
public static void main(String args[])
{
	try
	{
	 String str=null;
	System.out.println(str.charAt(0));
	}
		catch(Exception e)
		{
		System.out.println(e.getMessage());
		}
}
}