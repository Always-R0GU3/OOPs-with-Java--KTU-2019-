import java.util.*;
class palin
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,l;
		String st,rev="";
		System.out.println("Enter the string: ");
		st=sc.next();
		l=st.length();
		for(i=l-1;i>=0;--i)
			rev=rev+st.charAt(i);
		if(st.equals(rev))
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");
	}
}
