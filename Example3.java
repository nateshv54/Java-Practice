import java.util.*;
public class Example3 {



public static void main(String[] args) {

ArrayList al=new ArrayList();

al.add(23);
al.add(34);
al.add(12);
al.add(90);
al.add(44);
al.add(23);
al.add(34);

Iterator it=al.iterator();
while(it.hasNext()) {
System.out.print(it.next()+" ");
}