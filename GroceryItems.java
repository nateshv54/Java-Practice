import java.util.Scanner;

public class GroceryItems {

//Define the main method
public static void main(String[] args){
   
//Declare and initialize variables
Scanner s=new Scanner(System.in);
//Take the 10 different expenses price
System.out.println("Enter the expenses : ");
 float a[]=new float[10];
   for(int i=0;i<10;i++) {
      a[i]=s.nextFloat();
   }
//Check the 10 different expenses price using for loop
float max=a[0];
//Calculate the highest price in all expenses and check if the expenses is more than new item. If true then return max.
for(int i=1;i<a.length;i++){
   if(a[i]>max)
      max=a[i];
}
//Print the result
System.out.println("The highest price you incurred is " +max);
   }
}