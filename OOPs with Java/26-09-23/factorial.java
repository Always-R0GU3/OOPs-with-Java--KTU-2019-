import java.util.*;
class factorial
{
	public static void main(String args[])
	{
		int n,p=1;
		System.out.println("Enter the number to find factorial of:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
			p=p*i;
		System.out.println("The factorial of "+n+" is "+p);
	}
}
