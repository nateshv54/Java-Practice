import java.util.Scanner;

public class TwoDimentionalArray {

//Define the main method
public static void main(String[] args) {
//Declare the variables
Scanner s=new Scanner(System.in);
//Take number of rows and columns from user in two-dimensional array
System.out.println("Enter number of row and column :");
 int r=s.nextInt();
 int c=s.nextInt();
int a[][]=new int[r][c];
//assume first element is largest and use for loop to compare the largest element with all the reamaining elements
int max=a[0][0];
//Calcualte the maximum element based on index poistion
for(int i=0;i<r;i++)
{
   for(int j=0;j<c;j++)
   { 
      a[i][j]=s.nextInt();
      System.out.println("Enter arr ["+i+"] ["+j+"] : "+a[i][j]);
   }
}
for(int i=0;i<r;i++)
{
   for(int j=1;j<c;j++) {
      if(a[i][j]>max){
         System.out.println("Largest element in the array is "+a[i][j]+" and the index postion is arr["+i+"] ["+j+"]");
      }
      else{
         System.out.println("Largest element in the array is "+max+" and the index postion is arr[0][0]");
      }
   }
}
//Print result
   }
}