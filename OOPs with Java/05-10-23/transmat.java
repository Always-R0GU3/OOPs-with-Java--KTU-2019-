import java.util.*;
class transmat
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int rno,cno,i,j;
		System.out.println("Enter the number of rows:");
		rno=sc.nextInt();
		System.out.println("Enter the number of columns:");
		cno=sc.nextInt();
		int mat[][]=new int[rno][cno];
		System.out.println("Enter the elements of the matrix:");
		for(i=0;i<rno;i++)
			for(j=0;j<cno;j++)
				mat[i][j]=sc.nextInt();
		for(i=0;i<cno;i++){
			for(j=0;j<rno;j++)
				System.out.print(mat[j][i]+"  ");
			System.out.println();
			}
	}
}
