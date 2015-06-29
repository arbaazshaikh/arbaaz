import static org.junit.Assert.*;

import org.junit.Test;

public class BankAccountTest {
BankAccount b = new BankAccount();
	/*@Test
	public void testDepositCash() {
		//fail("Not yet implemented");
	}

	@Test
	public void testWithdrawCash() {
		//fail("Not yet implemented");
	}
*/
	
	@Test
	public void testGetBalance() {
		//fail("Not yet implemented");
		b.depositCash(500);
		b.withdrawCash(500);
		assertEquals(500,b.getBalance());
	}

}
