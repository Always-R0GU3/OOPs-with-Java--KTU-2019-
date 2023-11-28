class mythread1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			if(i%2!=0)
				System.out.println("Odd Number: "+i);
		}
		
	}
}

class mythread2 extends Thread
{
	public void run()
	{
		for(int j=1;j<=100;j++)
		{
			if(j%2==0)
				System.out.println("Even Number: "+j);
		}
	}
}

class multithreading
{
	public static void main(String args[])
	{
		new mythread1().start();
		new mythread2().start();
	}
}
