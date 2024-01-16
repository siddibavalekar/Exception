import java.util.Scanner;

class Exception_ArrayIndex_outof_bound
{
public static void main(String args[])
{
	try
	{
	int a[]={2,4,6,8,9};
	System.out.println(a[6]);
	}

		catch(Exception e)
		{
		System.out.println(e.getMessage());
		}

System.out.println("Exception is over");

}
}