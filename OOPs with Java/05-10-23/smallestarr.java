import java.util.*;
class smallestarr
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[50];
		int n,small,i;
		System.out.println("Enter the number of elements:");
		n=sc.nextInt();
		System.out.println("Enter the elements:");
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		small=arr[0];
		for(i=0;i<n;i++)
			if(arr[i]<small)
				small=arr[i];
		System.out.println("The smallest number is "+small);
	}
}
