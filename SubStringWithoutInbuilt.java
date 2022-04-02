import java.util.Scanner;

public class SubStringWithoutInbuilt {

//main method
public static void main(String[] args){
//declare variables
Scanner s=new Scanner(System.in);
System.out.println("Enter the input : ");
String s1=s.nextLine();
//take input from user
System.out.println("Enter the string to search : ");
String s2=s.nextLine();
System.out.println(issubstring(s1,s2));
}                
//compare two strings if the search string found or not without using inbuilt method isSubString()

//creat isSubString method in that declare variable 

//check two strings if the search string is present then return true else return false
    public static boolean issubstring(String s1,  String s2){
        int c=0;
        for(int i=0;i<s1.length();i++) {
            if(s1.charAt(i)==s2.charAt(c)){
                c++;
                if(c==s2.length()) {
                    return true;
                }
            }else {
                c=0;}
        }
        return false;
}
