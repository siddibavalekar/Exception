import java.util.Scanner;

class Exception_StringIndex_outof_Bound
{
public static void main(String args[])
{
	try
	{
	String str="siddhi";
	System.out.println(str.charAt(7));
	}

		catch(Exception e)
		{
		System.out.println(e.getMessage());
		}

		finally
		{
		System.out.println("end of Exception");
		}
}
}