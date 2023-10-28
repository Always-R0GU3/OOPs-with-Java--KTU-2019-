import java.util.*;
class sumofarr
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[50];
		int n,sum=0;
		System.out.println("Enter the number of elements:");
		n=sc.nextInt();
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("The sum of the elements is "+sum);
	}
}
