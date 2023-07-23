import java.util.*;
import java.lang.*;
class Swap
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int a,b;
		System.out.println("Enter Two Numbers For Swap :");
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("\nBefore Swapping \n a = "+a+" b = "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping \n a = "+a+" b = "+b);
	}
}