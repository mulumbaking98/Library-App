import static org.junit.Assert.*;

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
	        Copy p = new Copy("100", "Harry Potter", "10001212", "");
	        Controller.AddCopy(p);
	        Controller.CheckIn(p.getBarcode(), p.getId());
	        Controller.CheckOut(p.getBarcode(), p.getId());
	        Assert.assertEquals("OUT", p.getStatus());
	    }


	    @Test
	    public void checkInTest() {
	        Patron patron = new Patron("John", "100");
	        Controller.Patrons.add(patron);
	        Worker w = new Worker("Jude","12345");
	        Controller.Worker = w;

	        Copy p = new Copy("100", "Harry Potter", "10001212", "");
	        Controller.AddCopy(p);
	        Controller.CheckIn(p.getBarcode(), p.getId());

	        Assert.assertEquals("IN", p.getStatus());
	    }

	@Test
	public void testCheckCopyIn()
	{
//		StdOut.println("testCheckCopyOut called");
		fail("Not yet implemented");
	}

}
