import java.util.*;
class matrixmul
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int rno1,cno1,rno2,cno2,i,j;
		System.out.println("Enter the number of rows and columns of first matrix:");
		rno1=sc.nextInt(); cno1=sc.nextInt();
		System.out.println("Enter the number of rows and columns of second matrix:");
		rno2=sc.nextInt(); cno2=sc.nextInt();
		if(cno1==rno2)
		{
			int mat1[][]=new int[rno1][cno1];
			int mat2[][]=new int[rno2][cno2];
			int result[][]=new int[rno1][cno2];
			System.out.println("Enter the elements of the first matrix:");
			for(i=0;i<rno1;i++)
				for(j=0;j<cno1;j++)
					mat1[i][j]=sc.nextInt();
			System.out.println("Enter the elements of the second matrix:");
			for(i=0;i<rno2;i++)
				for(j=0;j<cno2;j++)
					mat2[i][j]=sc.nextInt();
			for(i=0;i<rno1;i++)
				{
				for(j=0;j<cno2;j++)
					{
					result[i][j] = 0;
					for (int k = 0; k < rno2; k++) {
               					 result[i][j] += mat1[i][k] * mat2[k][j];
           					 }
 					System.out.print(result[i][j]+"  ");
        				}
 
        			System.out.println();
   				}
		}
		else
			System.out.println("Multiplication is not possible");
	}
}

