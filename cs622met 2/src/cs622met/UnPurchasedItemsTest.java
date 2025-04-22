package cs622met;



import org.junit.Test;

public class UnPurchasedItemsTest {

	@Test
	public void testMarket() {
		UnPurchasedItems unp = new UnPurchasedItems();
		assert (unp.market1()==5.1);
	}

}
