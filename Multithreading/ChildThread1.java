
public class ChildThread1 extends Thread{
	public ChildThread1() {
		start();
	}
	
	public void run() {
		for (int i =1; i<11; i++) {
			System.out.println("Child 1 says Hello :)");
			try{

			Thread.sleep(1000);
		}catch(Exception e){}
		}
	}
	
	
}
