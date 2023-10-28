import java.util.*;
class addmatrix
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int rno,cno,i,j;
		System.out.println("Enter the number of rows:");
		rno=sc.nextInt();
		System.out.println("Enter the number of columns:");
		cno=sc.nextInt();
		int mat1[][]=new int[rno][cno];
		int mat2[][]=new int[rno][cno];
		int summat[][]=new int[rno][cno];
		System.out.println("Enter the elements of First matrix:");
		for(i=0;i<rno;i++)
			for(j=0;j<cno;j++)
				mat1[i][j]=sc.nextInt();
		System.out.println("Enter the elements of Second matrix:");
		for(i=0;i<rno;i++)
			for(j=0;j<cno;j++)
				mat2[i][j]=sc.nextInt();
		for(i=0;i<rno;i++)
			for(j=0;j<cno;j++)
				summat[i][j]=mat1[i][j]+mat2[i][j];
		for(i=0;i<rno;i++){
			for(j=0;j<cno;j++)
				System.out.print(summat[i][j]+"  ");
			System.out.println();
			}
	}
}
