public class Example2 implements Runnable {
	public void run() {
		for(int i=1;i<=15;i++)
		{   try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
			System.out.println("child Thread");
		}
	}

	public static void main(String[] args) {
		
		Example2 obj=new Example2();
		Thread t=new Thread(obj);
		t.start();
		
		
		for(int i=1;i<=15;i++) {
			try {
				Thread.sleep(2000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			System.out.println("Main Thread");
		}
	}

}
