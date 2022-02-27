import java.util.Scanner;
class Sumofdigits{
public static void main(String args[]){
    int sum=0,digits;
    Scanner s=new Scanner(System.in);
System.out.print("Enter the number for num: ");
int n=s.nextInt();
while(n>0)
{
    digits=n%10;
    sum=sum+digits;
    n/=10;
    
}
System.out.print("\nSum of the digits: "  + sum);
}
}