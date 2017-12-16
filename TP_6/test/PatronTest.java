import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PatronTest
{
	private Copy c;
	private Copy c2;
	private Patron p;


	@After
	public void tearDown() throws Exception
	{
	}

	  @Test
	    public void checkoutTest() {
	        Patron patron = new Patron("John", "100");
	        Controller.Patrons.add(patron);
	        Worker w = new Worker("Jude","12345");
	        Controller.Worker = w;
	        Copy c = new Copy("100", "Harry Potter", "10001212", "");
	        Controller.AddCopy(c);
	        String co =Controller.getCopyById(c.getBarcode()).getBarcode();
//	        Controller.CheckIn(p.getBarcode(), patron.getId());
	        Controller.CheckOut(co, patron.getId());
	        Assert.assertEquals(null, c.getDueDate());
	    }


//	    @Test
//	    public void checkInTest() {
//	        Patron patron = new Patron("John", "100");
//	        Controller.Patrons.add(patron);
//	        Worker w = new Worker("Jude","12345");
//	        Controller.Worker = w;
//
//	        Copy p = new Copy("100", "Harry Potter", "10001212", "");
//	        Controller.AddCopy(p);
//	        Controller.CheckIn(p.getBarcode(), p.getId());
//
//	        Assert.assertEquals("IN", p.getStatus());
//	    }
	    
	    @Test
		public void test_setPatronId() {
			Patron p = new Patron("John", "100");
			p.setId("1");
			assertEquals("Patron id not set", "1", p.getId());
		}
	    
	    @Test
		public void test_setPatronName() {
			Patron p = new Patron("John", "100");
			p.setName("jj");
			assertEquals("Patron name not set", "jj", p.getName());
		}
	    
	    @Test
		public void test_Burrowed() {
			Copy p = new Copy("1", "Fun Things", "b1", "OUT");
			ArrayList<Copy> pp = new ArrayList<>();
			pp.add(p);
			Patron pat = new Patron("John", "100");
			
			pat.setBurrowedBooks(pp);
			assertNotNull( pat.getBurrowedBooks());
		}



}//end patron
