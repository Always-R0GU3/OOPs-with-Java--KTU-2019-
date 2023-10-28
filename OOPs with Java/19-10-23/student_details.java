import java.util.*;
class student_details
{
	static String name;
	static int rollno;
	static int mark[]=new int[5];
	static void readdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the student name:");
		name=sc.next();
		System.out.print("Enter the roll no:");
		rollno=sc.nextInt();
		System.out.println("Enter the marks of 5 subjects:");
		for(int i=0;i<5;i++)
			mark[i]=sc.nextInt();
	}
	static void printdata()
	{
		System.out.println("\nStudent Name: "+name);
		System.out.println("Student Roll No: "+rollno);
		System.out.println("Mark Details:");
		for(int i=0;i<5;i++)
			System.out.println(mark[i]);
	}
	public static void main(String args[])
	{
		readdata();
		printdata();
	}
}


