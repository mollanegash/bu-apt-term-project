package cs622met;

import org.junit.Test;

public class ShoppingsViewTest {

	@Test
	public void testRun() {
		ShoppingsView shview = new ShoppingsView();
		assert(shview.run("Molla", 12345645, 1500, "mobile", 123, 1, 500, 500, 1000));
		
	}

}
