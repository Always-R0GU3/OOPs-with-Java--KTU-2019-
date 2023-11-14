import java.util.*;
class peri_shapes
{
	peri_shapes(int r)
	{
		double per=2*3.14*r;		
		System.out.println("\nThe Perimeter of the Circle is "+per);
	}
	peri_shapes(int l,int b)
	{
		double per=2*(l+b);
		System.out.println("The Perimeter of the Circle is "+per);
	}
}

class perimeter
{
	public static void main(String args[])
	{ 	
		int r,l,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Radius of the Circle");
		r=sc.nextInt();
		System.out.println("Enter the Length and Breadth of the Rectangle");
		l=sc.nextInt();
		b=sc.nextInt();
		peri_shapes s1=new peri_shapes(r);
		peri_shapes s2=new peri_shapes(l,b);
	}
}
