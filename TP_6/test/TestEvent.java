import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestEvent {

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testEve() {
		
		Event evnt = new Event();

		assertNotNull(evnt);
	}
	
	
	@Test
	public void testReturnt() {
		int c = 0;
		
		assertEquals("End Session", Event.printEvents(0));
	}
	
	@Test
	public void test8() {
		int c = 8;
		
		assertNotNull("Copy is checked out", Event.printEvents(8));
	}

	@Test
	public void testEvent() {
		int c = 0;
		
		assertNotNull("Copy is checked out", Event.printEvents(0));
	}
	
	@Test
	public void test1() {
		int c = 1;
		
		assertNotNull("Copy is checked out", Event.printEvents(1));
	}
	@Test
	public void test2() {
		int c = 2;
		
		assertNotNull("Copy is checked out", Event.printEvents(2));
	}
	@Test
	public void test3() {
		int c = 3;
		
		assertNotNull("Copy is checked out", Event.printEvents(3));
	}
	@Test
	public void test4() {
		int c = 4;
		
		assertNotNull("Copy is checked out", Event.printEvents(4));
	}
	@Test
	public void test5() {
		int c = 5;
		
		assertNotNull("Copy is checked out", Event.printEvents(5));
	}
	@Test
	public void test6() {
		int c = 6;
		
		assertNotNull("Copy is checked out", Event.printEvents(6));
	}
	@Test
	public void test7() {
		int c = 7;
		
		assertNotNull("Copy is checked out", Event.printEvents(7));
	}

}
