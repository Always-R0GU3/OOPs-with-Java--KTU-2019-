abstract class Shape
{
	abstract int numberOfSides();
}

class Rectangle extends Shape
{
	int numberOfSides()
	{
		return 4;
	}
}

class Triangle extends Shape
{
	int numberOfSides()
	{
		return 3;
	}
}

class Hexagon extends Shape
{
	int numberOfSides()
	{
		return 6;
	}
}

class sides_of_shapes
{
	public static void main(String args[])
	{
		Rectangle r1=new Rectangle();
		Triangle t1=new Triangle();
		Hexagon h1=new Hexagon();
		System.out.println("Number of Sides of a Rectangle is "+r1.numberOfSides());
		System.out.println("Number of Sides of a Triangle is "+t1.numberOfSides());
		System.out.println("Number of Sides of a Hexagon is "+h1.numberOfSides());	
	}
}
