import java.util.*;
class largestmat
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int rno,i,j,lar;
		System.out.println("Enter the number of rows and columns:");
		rno=sc.nextInt();
		int mat[][]=new int[rno][rno];
		System.out.println("Enter the elements:");
		for(i=0;i<rno;i++)
			for(j=0;j<rno;j++)
				mat[i][j]=sc.nextInt();
		lar=mat[0][0];
		for(i=0;i<rno;i++)
			for(j=0;j<rno;j++)
				if(mat[i][j]>lar)
					lar=mat[i][j];
		System.out.println("The largest element in the matrix is "+lar);
	}
}
