import java.util.Scanner;

public class IntToString {

//main method
public static void main(String[] args) {

//declare int type variable
Scanner s=new Scanner(System.in);


//take input from user
 int n=s.nextInt();
 System.out.println("Enter the index postion : ");
  int m=s.nextInt();

//converting integer to string using toString method
 String s1=Integer.toString(n);
//use inbuilt function to print index position
char k=s1.charAt(m);
  


//print result
    System.out.println("Char found at index postion " +m+" = "+k);
}
}