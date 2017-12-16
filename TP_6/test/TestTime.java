import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestTime {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testTime() {
		GetDateDifference g= new GetDateDifference();
		
		assertNotNull("Day is null", g);
	}
	
	@Test
	public void test_Differe() {
		String d1 = "12/16/2017";
		String d2 = "12/18/2017";
		assertEquals("Day difference", 2, GetDateDifference.getTimeDifference(d1,d2));
	}
	
	@Test
	public void getDate_Time() {

		assertNotNull("Today", GetDateDifference.getDate_Time());
	}

}
