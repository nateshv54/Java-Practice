import java.util.Scanner;

public class SubStringWithInbuilt {

//main method
public static void main(string[] args) {

//declare variables
Scanner s=new Scanner(System.in);
//take input from user
System.out.println("Enter the input string : ");
String s1=s.nextLine();
System.out.println("Enter search string : ");
String s2=s.nextLine();
//check if the string contains substring or not if contains print found else print not found
boolean result=s1.contains(s2);
if(result){
    System.out.println(s2+ " is found");
}
    else
    {
        System.out.println(s2+ " is not found");
    }
}
}