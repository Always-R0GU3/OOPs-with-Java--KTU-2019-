class prime
{
	public static void main(String args[])
	{
		int n=792,flag=1;
		for(int i=2;i<n/2;i++)
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
