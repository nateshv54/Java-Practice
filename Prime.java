import java.util.*;
public class Prime
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=s.nextInt();
        int flag=0;
        for(int i=2;i<n;i++)
        {
         if(n%i==0)
            {
             flag=1;
            }
       
        }
        if(flag==0)
        {
            System.out.println("Prime Number");
        }
        else
        {
            System.out.println("Not a Prime Number");
        }
    }

}