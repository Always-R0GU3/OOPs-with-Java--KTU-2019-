import java.util.*;
class shapes
{
	void area(int x)
	{
		double ar=3.14*x*x;
		System.out.println("The area of Circle is "+ar);
	}
	void area(int x,int y)
	{
		double ar=x*y;
		System.out.println("The area of Rectangle is "+ar);
	}
	void area(double x,int y,int z)
	{
		double ar=x*y*z;
		System.out.println("The area of Triangle is "+ar);
	}
}

class areaofshapes
{
	public static void main(String args[])
	{
		int radius,length,breadth,base,height;
		Scanner sc=new Scanner(System.in);
		shapes s1=new shapes();
		System.out.print("Enter the radius of the Circle: ");
		radius=sc.nextInt();
		System.out.println("Enter the length and breadth of the Rectangle");
		length=sc.nextInt();
		breadth=sc.nextInt();
		System.out.println("Enter the base and height of the Triangle");
		base=sc.nextInt();
		height=sc.nextInt();
		s1.area(radius);
		s1.area(length,breadth);
		s1.area(0.5,base,height);
	}
}
