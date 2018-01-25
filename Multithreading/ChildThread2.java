
public class ChildThread2 extends Thread{
	public ChildThread2() {
		start();
	}
	
	public void run() {
		for (int i =1; i<11; i++) {
			System.out.println("Child 2 says OK :/");
			try{

			Thread.sleep(1000);
		}catch(Exception e){}
		
		}
	}
	
	
}
