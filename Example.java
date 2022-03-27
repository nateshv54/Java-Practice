public class Example extends Thread{



public void run() {
for(int i=1;i<=15;i++) {
System.out.println("child Thread");
}
}
public static void main(String[] args) {

Example obj=new Example();
obj.start();

for(int i=1;i<=15;i++) {
System.out.println("Main Thread");
}
}
}