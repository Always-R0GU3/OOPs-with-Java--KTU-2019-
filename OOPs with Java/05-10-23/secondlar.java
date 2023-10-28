import java.util.*;
class secondlar
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[50];
		int n,i,j,temp;
		System.out.println("Enter the number of elements:");
		n=sc.nextInt();
		System.out.println("Enter the elements:");
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(i=1;i<n-1;i++)
			for(j=0;j<n-i;j++)
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
		System.out.println("The Second Largest element is "+arr[n-2]);
	}
}
