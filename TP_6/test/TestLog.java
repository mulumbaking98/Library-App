import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 */

/**
 * @author maya5348 and Rumman
 *
 */
public class TestLog {
	
	private Log log;
	//String workerId, String timedate, String eve

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void LogTest() {
		   log = new Log("adm","23/11/2017","Login");
			
		assertNotNull("worker is null", log);
	}
	
	@Test
	public void test_set_worker_id() {
		log = new Log("adm","23/11/2017","Login");
		
		log.setWorkerId("win");
		assertEquals("set worker Id failed", "win", log.getWorkerId());
	}
	
	@Test
	public void test__Time_Date() {
		log = new Log("adm","23/11/2017","Login");
		
		log.setTimeDate("23/10/2017");
		assertEquals("set get Date  failed", "23/10/2017", log.getTimeDate());
	}
	
	@Test
	public void test_event() {
		log = new Log("adm","23/11/2017","Login");
		
		log.setEvent("Check book out");
		assertEquals("Check book out failed", "Check book out", log.getEvent());
	}
	
//	writeFile(String workerid,String timesDate, int event)

	@Test
	public void test_L() {
		log = new Log("adm","23/11/2017","Login");
		
	
		assertNotEquals("Check book out failed", "Check book out", log.writeFile("adm","23/11/2017",2));
	}
}//end test
