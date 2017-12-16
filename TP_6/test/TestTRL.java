import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestTRL {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testTrl() {
		TRLApp t = new TRLApp();
		
		assertNotNull("Day is null", t);
		
	}

}
