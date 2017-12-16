import static org.junit.Assert.*;

import java.io.FileNotFoundException;

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
	   
	   @Test
	    public void loginWorkerTest() throws FileNotFoundException {
	        Worker worker = new Worker("admin2","admin2");
	        boolean lg = Controller.LogInWorker(worker.getName(), worker.getId());
	        
	        assertEquals(true, lg);
	    }
	   
	   @Test
	    public void printCopyTest() {
		   Copy c = new Copy("100", "Harry Potter", "10001212", "");
	        Controller.Copies.add (c);
	        
	        assertNotNull(Controller.Copies);
	    }
	   
	   @Test
	    public void printPatronTest() {
		   Patron p = new Patron("John", "100");
	        Controller.Patrons.add(p);
	        
	        assertNotNull(Controller.Patrons);
	    }
	   
	   @Test
	    public void printLogTest() {
		   Log l = new Log("John","12/34/56","log");
	        Controller.logData.add(l);
	        
	        assertNotNull(Controller.logData);
	    }
	   
	   @Test
	    public void controllerTest() {
		   Controller c = new Controller();

	        
	        assertNotNull(c);
	    }



	   
}//end controller test
