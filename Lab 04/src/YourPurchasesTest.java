import org.junit.Test;
import org.junit.Assert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class YourPurchasesTest {

	private static final double EPSILON = 1E-12;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test public void twoPurchases() {
		YourPurchases register = new YourPurchases();
	    register.recordPurchase(0.75);
	    register.recordPurchase(1.50);
	    register.receivePayment(2, 0, 5, 0, 0);
	    double expected = 0.25;
	    Assert.assertEquals(expected, register.giveChange(), EPSILON);
	}
	
	@Test public void noPurchase() {
		YourPurchases purchase = new YourPurchases();
		purchase.recordPurchase(0);
		purchase.receivePayment(0,50,0,0,0);
		double expected = 12.5;
		Assert.assertTrue(expected == purchase.giveChange());
	}
	
	@Test public void initialStatus( ) {
		YourPurchases purchase = new YourPurchases();
		double expected = 0;
		Assert.assertTrue(expected==purchase.getPurchase());
	}

	@After
	public void tearDown() throws Exception {
	}

}
