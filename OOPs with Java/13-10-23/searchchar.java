import java.util.*;
class searchchar
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int l,i,flag=0;
		String st;
		char ch;
		System.out.println("Enter the string:");
		st=sc.next(); 
		l=st.length();
		System.out.println("Enter the character to search:");
		ch=sc.next().charAt(0);
		for(i=l-1;i>=0;i--)
			if(st.charAt(i)==ch)
			{
				System.out.println("Charater is found at position "+(i+1));
				flag=-1;
				break;
			}
		if(flag==0)
			System.out.println("Character not found");
	}
}
