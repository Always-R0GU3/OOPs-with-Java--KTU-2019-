import java.util.*;
class tracemat
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int rno,i,j,sum=0;
		System.out.println("Enter the number of rows and columns:");
		rno=sc.nextInt();
		int mat[][]=new int[rno][rno];
		System.out.println("Enter the elements of the matrix:");
		for(i=0;i<rno;i++)
			for(j=0;j<rno;j++){
				mat[i][j]=sc.nextInt();
				if(i==j)
					sum=sum+mat[i][j];
				}
		System.out.println("The trace of the matrix is "+sum);
	}
}
