import java.util.Scanner;

public class TransposeMatrix {

//Define the main method
public static void main(String[] args) {
//Declare the variables
Scanner s=new Scanner(System.in);

//Take input from user to enter rows and column values
System.out.println("Enter number of rows : ");
  int r=s.nextInt();
 System.out.println("Enter number of coloums : ");
   int c=s.nextInt();
   int a[][]=new int[r][c];
//Convert the square matrix into transpose
for(int i=0;i<r;i++){
   for(int j=0;j<c;j++)
   {
      a[i][j]=s.nextInt();
      System.out.println("Elements ["+i+"] ["+j+"]");
   }
}
//Print the transpose matrix
int transpose[][]=new int[c][r]
   for(int i=0;j<r;j++)
   {
      for(int i=0;i<c;i++)
      {
         transpose[j][i]=a[i][j];
      }
   }
//printing j and i instead of i and j
System.out.println("After Transpose matrix is "+transpose[j][i]);
}
}