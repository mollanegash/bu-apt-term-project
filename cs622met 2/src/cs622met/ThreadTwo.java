package cs622met;

public class ThreadTwo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String [] customername = {"Sami", "John","Meku", "Dani", "Zew"};
		for(int j = 0; j < customername.length; j++) {
			System.out.println(customername[j]);
//			try {
//				Thread.sleep(j);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
		
		System.out.println("I.ID= " + Thread.currentThread().getId() + " Name=" + Thread.currentThread().getName());
		
		
	}

}
