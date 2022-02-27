import java.util.Scanner;
public class Arithemtic {
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n1=s.nextInt();
	    System.out.println("Enter First Value: "+n1);
		int n2=s.nextInt();
		System.out.println("Enter Second Value: "+n2);
		int sum=n1+n2;
		System.out.println("Sum of two numbers is: "+sum);
		int d=n1/n2;
		System.out.println("Division of two numbers is: "+d);
		int m=n1*n2;
		System.out.println("Product of two numbers is: "+m);
		int r=n1%n2;
		System.out.println("Remainder of two numbers is: "+r);
		}
		
	}
