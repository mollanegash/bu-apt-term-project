package cs622met;



public class ConcurrencyTest  {

	public static void main(String[] args) {
		ConcurrencyTest con = new ConcurrencyTest();
		con.threadCall();
	
		

	}
	
	public void threadCall() {
		ThreadOne t1 = new ThreadOne();
		Thread thread1 = new Thread(t1);
				thread1.start();
		
		ThreadTwo t2 = new ThreadTwo();
		Thread thread2 = new Thread(t2);
		thread2.start();
	}
}