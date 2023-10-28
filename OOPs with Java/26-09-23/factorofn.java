import java.util.Scanner;
class factorofn
{
	public static void main(String args[])
	{
		int n;
		System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("The factors are: ");
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				System.out.println(i);
		}	
	}
}
