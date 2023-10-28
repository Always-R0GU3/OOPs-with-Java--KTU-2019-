import java.util.*;
class freqchar
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String st;
		char ch;
		int i,l,count=0;
		System.out.println("Enter the string:");
		st=sc.next();
		l=st.length();
		System.out.println("Enter the charcter to find frequency of:");
		ch=sc.next().charAt(0);
		for(i=l-1;i>=0;i--)
			if(st.charAt(i)==ch)
				count++;
		if(count==0)
			System.out.println("Character you searched is not found!");
		else
			System.out.println("Frequench of the character "+ch+" is "+count);
	}
}	
