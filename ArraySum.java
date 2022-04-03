import java.util.*;
public class ArraySum {

//Define the main method
 public static void main(string[] args){

//Declare the variables and initialize
   int sum=0;
 Scanner s=new Scanner(System.in);
System.out.println("Enter size of the array: ");
 int n=s.nextInt();
 System.out.println("Enter the elements of array: ");
  int a[]=new int[n];
     for(i=0;i<n-1;i++){
     a[i]=s.nextInt();
     }
//Take input from user

//Check user input values using for loop and add all values
 for(int i=0;i<a.length;i++){
     sum+=a[i];
 }
//Print the result
System.out.println("Sum of array Elements is : "+sum);
 }
}