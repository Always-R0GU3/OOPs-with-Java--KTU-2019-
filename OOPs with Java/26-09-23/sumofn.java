import java.util.Scanner;
class sumofn
{
	public static void main(String args[])
	{
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		for(int i=0;i<=n;i++)
			sum=sum+i;
		System.out.println("The sum is "+sum);
	}
}
