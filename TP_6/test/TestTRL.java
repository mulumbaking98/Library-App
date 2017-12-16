import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Before;
import org.junit.Test;

public class TestTRL {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testTrl() throws FileNotFoundException {
		TRLApp t = new TRLApp();
		
		assertNotNull("Day is null", t);
		
	}
	

}
