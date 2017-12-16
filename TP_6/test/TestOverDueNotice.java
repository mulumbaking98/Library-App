import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class TestOverDueNotice {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testOverDueNotice() {
		OverDueNotice o = new OverDueNotice();
		assertNotNull("Over due null", o);
	}
	
	@Test
	public void test_setPatron() {
		 Patron p = new Patron("John", "100");
		 OverDueNotice.setPatron(p);
		 
		assertEquals("patron id not set", "100", p.getId());
	}
	
	
	@Test
	public void test_returnDuen() {
		 Patron p = new Patron("John", "100");
		 OverDueNotice.setDueDate("12/12/2017");
		 
		 assertEquals(null, OverDueNotice.getDueDate());
	}
	
	@Test
	public void test_setNotice() {
		OverDueNotice o = new OverDueNotice();
		o.setNotice("1");
		assertEquals("Notice not set", "1", o.getNotice());
	}
	
	@Test
	public void test_setDate() {
		OverDueNotice o = new OverDueNotice();
		o.setReturnDate("1");
		assertEquals("return date not set", "1", o.getReturnDate());
	}
	
	@Test
	public void test_setTotalFine() {
		OverDueNotice o = new OverDueNotice();
		o.setTotalFine(0.0);
		assertEquals(0.0, 0.0, o.getTotalFine());
	}
	

}
