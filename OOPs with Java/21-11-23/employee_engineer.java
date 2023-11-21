class Employee
{
	int Salary=10000;	
	void display()
	{
		System.out.println("Name of class is Employee");
	}
	void calcSalary()
	{
		System.out.println("Salary of employee is "+Salary);
	}
}

class Engineer extends Employee
{
	int Salary=20000;
	void calcSalary()
	{
		System.out.println("Salary of employee is "+Salary);
	}
}

class employee_engineer
{
	public static void main(String args[])
	{
		Engineer e1=new Engineer();
		e1.display();
		e1.calcSalary();
	}
}
