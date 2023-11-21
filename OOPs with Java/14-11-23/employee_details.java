import java.util.*;
class employee
{
	int empno;
	String name;
	int phno;
	employee(int empno,String name,int phno)
	{
		this.empno=empno;
		this.name=name;
		this.phno=phno;
	}
	void display(int n)
	{
		System.out.println("\nDetails of Employee number "+n);
		System.out.println("Employee ID Number: "+empno);
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Phone Number: "+phno);
	}
}
class employee_details
{
	public static void main(String args[])
	{
		int n,empno;
		String name;
		int phno;
		System.out.println("Enter the number of Employees");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		employee e[]=new employee[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the Employee Number:");		
			empno=sc.nextInt();
			System.out.println("Enter the Name of Employee:");
			name=sc.next();
			System.out.println("Enter the Phone Number:");
			phno=sc.nextInt();
			e[i]=new employee(empno,name,phno);
		}
		for(int i=0;i<n;i++)
			e[i].display(i+1);
	}
}
