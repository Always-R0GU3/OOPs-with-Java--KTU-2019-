import java.util.*;
class replacechar
{
	public static void main(String args[])	
	{
		Scanner sc=new Scanner(System.in);
		String st;
		char ch1,ch2;
		int i,l,flag=0;
		System.out.println("Enter the string");
		st=sc.next();
		l=st.length();
		System.out.println("Enter the character to replace:");
		ch1=sc.next().charAt(0);
		for(i=l-1;i>=0;i--)
			if(st.charAt(i)==ch1)
			{
				System.out.println("Enter the character to replace with:");
				ch2=sc.next().charAt(0);
				flag=-1;
				System.out.println("Your string is "+st.replace(ch1,ch2));
				break;
			}
		if(flag==0)
			System.out.println("Character you searched is not found!");
	}
}	
