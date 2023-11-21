class exception_handling
{
	public static void main(String args[])
	{
		try{
			int result;
			result=25/0;
			System.out.println(result);
		}
		catch(ArithmeticException e1){
			System.out.println("Arithmetic Exception occured");
		}
		try{
			int arr[]=new int[5];
			arr[6]=72;
		}
		catch(ArrayIndexOutOfBoundsException e2){
			System.out.println("Array out of Index Exception occured");
		}
	}
}
