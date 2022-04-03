import java.util.Scanner;

public class Temperature{

//Define the main method
public static void main(String args[]) {
//Declare the variables and initialize
Scanner s=new Scanner(System.in);
//Take temperature of 7 days as a input from user
  System.out.println("Enter number of days : ");
   int n=s.nextInt();
   int temp[]=new int[n];
for(int i=0;i<temp.length;i++)
{
   temp[i]=s.nextInt();
   System.out.println("Enter the temperature of Day : "+i);
   System.out.println(temp[i]);
}
//Calculate the lowest temperature
int min=temp[0];
   for(int i=1;i<temp.length;i++){
      if(temp[i]<min){
         min=temp[i];
         System.out.println("The Lowest temperature of the week is Day "+i+"is "+temp[i]);
      }
//Print the result
}
}
}