import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 */

/**
 * @author maya5348
 *
 */
public class ControllerTest {

	   @Test
	    public void findPatronsTest() {
	        Patron p = new Patron("John", "100");
	        Controller.Patrons.add(p);
	        assertEquals("John", Controller.getPatronById("100").getName());
	        assertEquals(null, Controller.getPatronById("1001"));
	    }
	   
	   @Test
	    public void findCopiesTest() {
	        Copy p = new Copy("100", "Harry Potter", "10001212", "");
	        Controller.AddCopy(p);
	        assertEquals("Harry Potter", Controller.getCopyById("10001212").getTitle());
	        assertEquals(null, Controller.getCopyById("1001"));
	    }
	   
	   @Test
	    public void findWorkerTest() {
	        Controller.Worker = new Worker("admin2","admin2");
	        
	        assertEquals("admin2", Controller.Worker.getId());
	    }

}//end controller test
