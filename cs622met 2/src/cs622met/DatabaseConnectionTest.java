package cs622met;



import org.junit.Test;

public class DatabaseConnectionTest {

	@Test
	public void testFetchDataFromModel() {
		DatabaseConnection db = new DatabaseConnection();	
		assert (db.expense()==10.2);
		
		
		    
	}

}
