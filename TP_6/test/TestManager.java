import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class TestManager {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testManager() {
		Manager man = new Manager();
		assertNotNull(man);
	}
	
//	@Test
//	public void testPrint() {
////		ArrayList<Hold> Holds= new ArrayList<>();
//		Manager man = new Manager();
//		
//		assertNotNull(Manager.PrintHold());
//	}
	
//	@Test
//	public void testAdd() {
////		ArrayList<Hold> Holds= new ArrayList<>();
//		String fine = "32";
//		Copy c = new Copy("1", "Fun Things", "b1", "OUT");
//		 Patron p = new Patron("John", "100");
//		 
//		 Manager.AddHold(fine, c, p);
//		 
////		 String d = Manager.PrintHold();
//		
//		 assertEquals(null,Hold.getFine());
//	}
//
//	private void assertNotNull(Object printHold) {
//		// TODO Auto-generated method stub
//		
//	}
	
	
}
