class Employee
{
	String Name,Address;
	int Age,Salary;
	long Phno;
	Employee(String Name,String Address,int Age,long Phno,int Salary)
	{
		this.Name=Name;
		this.Address=Address;
		this.Age=Age;
		this.Phno=Phno;
		this.Salary=Salary;
	}
	void display()
	{
		System.out.println("Name: "+Name);
		System.out.println("Age: "+Age);
		System.out.println("Phone Number: "+Phno);
		System.out.println("Address: "+Address);
	}
	void print_Salary()
	{
		System.out.println("Salary: "+Salary);
	}
}

class Officer extends Employee
{
	String Specialization;
	Officer(String Name,String Address,int Age,long Phno,int Salary)
	{
		super(Name,Address,Age,Phno,Salary);		
		System.out.println("\nDetails of Officer");
		display();
		print_Salary();
	}
}

class Manager extends Employee
{
	String Department;
	Manager(String Name,String Address,int Age,long Phno,int Salary)
	{
		super(Name,Address,Age,Phno,Salary);		
		System.out.println("\nDetails of Manager");
		display();
		print_Salary();
	}
}

class emp_officer_manager
{
	public static void main(String args[])
	{
		Officer o1=new Officer("Ram","Mumbai",32,1234567899,50000);
		Manager m1=new Manager("Tom","California",28,587654321,55000);
	}
}
