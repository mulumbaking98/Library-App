import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


/**
 * @author maya5348
 *
 */
public class WorkerTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	
	private Worker worker;

	@Test
	public void test_new_worker() {
		   worker = new Worker("adm","admn");
		
		assertNotNull("worker is null", worker);
	}
	
	@Test
	public void test_constructor() {
		 worker = new Worker("ad", "admin");
		
		assertEquals("get id failure", "admin", worker.getId());
		assertEquals("get worker name failure", "ad", worker.getName());
	}

	@Test
	public void test_set_worker_id() {
		worker = new Worker("ad", "admin");
		
		worker.setId("ste");
		assertEquals("set workerID failure", "ste", worker.getId());
	}
	

	@Test
	public void test_worker_set_worker_name() {
		worker = new Worker("ad", "admin");
		
		worker.setName("win");
		assertEquals("set worker Name failure", "win", worker.getName());
	}
	
	@Test
	public void test_worker_get_Date() {
		worker = new Worker("ad", "admin");

		assertNotNull("set worker Name failure", worker.getDate());
	}
	


}
