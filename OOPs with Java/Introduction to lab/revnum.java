class revnum
{
	public static void main(String args[])
	{
		int n=102143,rev=0,num;
		System.out.println("Original number = "+n);
		while(n>0)
		{
			num=n%10;
			rev=rev*10+num;
			n=n/10;
		}
		System.out.println("Reversed number = "+rev);
	}
}
