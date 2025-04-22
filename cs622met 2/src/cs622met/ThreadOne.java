package cs622met;

public class ThreadOne implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int [] ids = {12,34,56,78,90,10};
		for(int i = 0; i < ids.length; i++) {
			System.out.println(ids[i]);
//			try {
//				//Thread.sleep(i);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
		System.out.println("I.ID= " + Thread.currentThread().getId() + " Name=" + Thread.currentThread().getName());
		
	}	

	

	
	




}
