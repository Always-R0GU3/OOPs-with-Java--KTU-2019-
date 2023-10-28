import java.util.*;
class oddeven
{
	public static void main(String args[])
	{
		int n;
		System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n%2==0)
			System.out.println("The number "+n+" is an Even number");
		else
			System.out.println("The number "+n+" is an Odd number");
	}

}

