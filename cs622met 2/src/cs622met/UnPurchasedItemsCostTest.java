package cs622met;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnPurchasedItemsCostTest {

	@Test
	public void testComputeCost() {
		PurchasedItems<?> pur = new PurchasedItems();
		assert(pur.computeCost()==10.2);
	}

}
