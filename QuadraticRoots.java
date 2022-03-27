import java.util.*;
import java.io.*;
public class QuadraticRoots {

public static void main(String[] args) {
Scanner s= new Scanner(System.in);
double a,b,c;
System.out.println("Enter the coefficients of the quadratic equation");
a = s.nextDouble();
b = s.nextDouble();
c = s.nextDouble();
double determinant = Math.pow(b,2) – 4*a*c;
if(determinant > 0)
{
System.out.println("Roots are " +(-b+Math.sqrt(determinant))/(2*a)+ " and " +(-b-Math.sqrt(determinant))/(2*a));
}
else if (determinant == 0)
{
System.out.println("Roots are " + -b/(2*a));
}
else
{
System.out.println("Roots are " + -b/(2*a) + "+i" +Math.sqrt(-determinant)/(2*a) + " and "+ -b/(2*a) + "-i"+Math.sqrt(-determinant)/(2*a));
}
}
}