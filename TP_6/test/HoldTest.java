import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HoldTest {
    @Test
    public void addHoldTest() {
        Patron patron = new Patron("John", "100");
        Controller.Patrons.add(patron);
        Worker w = new Worker("Jude","12345");
        Controller.Worker = w;
        Copy p = new Copy("100", "Harry Potter", "10001212", "");
        Controller.AddCopy(p);
        Controller.AddHold("100", p.getBarcode(), patron.getId());
    }


    @Test
    public void clearHoldTest() {
        Patron patron = new Patron("John", "100");
        Controller.Patrons.add(patron);
        Worker w = new Worker("Jude","12345");
        Controller.Worker = w;
        Copy p = new Copy("100", "Harry Potter", "10001212", "");
        Controller.AddCopy(p);
        Controller.AddHold("100", p.getBarcode(), patron.getId());
        Controller.ClearHold(p.getBarcode(), patron.getId());
    }
    
    @Test
	public void test_setCopy() {
    	String fine = "32";
		Copy c = new Copy("1", "Fun Things", "b1", "OUT");
		 Patron p = new Patron("John", "100");
		 
		 Hold h = new Hold(fine, c, p);
		h.setCopy(c);
		assertEquals("copy ID not set", "1", c.getId());
	}
    @Test
	public void test_setPatron() {
    	String fine = "32";
		Copy c = new Copy("1", "Fun Things", "b1", "OUT");
		 Patron p = new Patron("John", "100");
		 
		 Hold h = new Hold(fine, c, p);
		h.setPatron(p);
		assertNotNull("Patron ID not setJohn", h.getPatron());
	}
    @Test
	public void test_setFine() {
    	String fine = "32";
		Copy c = new Copy("1", "Fun Things", "b1", "OUT");
		 Patron p = new Patron("John", "100");
		 
		 Hold h = new Hold(fine, c, p);
		h.setFine(fine);
		assertEquals("Fine not set", "32", h.getFine());
	}

}
