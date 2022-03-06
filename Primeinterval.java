import java.util.Scanner;
public class Primeinterval
{
public static void main(String[] args)
{
//scanner class object creation
Scanner s=new Scanner(System.in);
System.out.print("Enter Starting Number : ");
int n1 = s.nextInt();
System.out.print("Enter Ending Number : ");
int n2 = s.nextInt();
System.out.println("Prime numbers between "+n1+" and "+n2+" are : ");
int count;
for(int i=n1;i<=n2; i++)
{
count = 0;
for(int j = 1 ; j <= i ; j++)
{
if(i % j == 0)
count+=1;
}
if(count == 2)
System.out.println(i);
}
//closing scanner class(not mandatory but good practice)
s.close();
}
}
