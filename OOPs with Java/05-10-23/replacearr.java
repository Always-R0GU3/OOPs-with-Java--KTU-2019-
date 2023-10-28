import java.util.*;
class replacearr
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[50];
		int n,i,num,index=0,flag=-1,r;
		System.out.println("Enter the number of elements:");
		n=sc.nextInt();
		System.out.println("Enter the elements:");
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter the number to be replaced:");
		num=sc.nextInt();
		for(i=0;i<n;i++)
			if(arr[i]==num){
				index=i;
				flag=0;
				break;
				}
		if(flag==0)
		{
			System.out.println("Enter the number to be replaced with:");
			r=sc.nextInt();
			arr[index]=r;
			for(i=0;i<n;i++)
				System.out.print(arr[i]+" ");
		}
		else
			System.out.println("Sorry! Element is not found");
	}
}
