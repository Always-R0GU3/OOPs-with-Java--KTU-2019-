import java.util.*;
class fib2
{
	public static void main(String args[])
	{
		int n,a=0,b=1,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<n-2;i++)
		{
			c=a+b;
			if(c>=n)
				break;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}
