import java.util.Scanner;
class prime2
{
	public static void main(String args[])
	{
		int n,flag=1;
		System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=2;i<=n/2;i++)
			if(n%i==0)
			{
				System.out.println(n+ " is not prime");
				flag=-1;
				break;
			}
	
		if(flag==1)
		System.out.println(n+" is prime");
	}
}
