package cs622met;

import org.junit.Test;

public class UnPurchasedItemsBankBalanceTest {

	@Test
	public void testCustomerBankBalance() {
		PurchasedItems<?> pur = new PurchasedItems<>();
		assert (pur.customerBankBalance() == 139.8);
	}

}
