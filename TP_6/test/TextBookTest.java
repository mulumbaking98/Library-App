import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


/**
 * @author maya5348
 *
 */
public class TextBookTest {
	
	private TextBook textBook;

	
	@Before
	public void create_sample_copy() {
		// create new textBook
		textBook = new TextBook("C1", "Fun with Objects");
		System.out.println("copy created");
	}
	
	@Test
	public void test_get_copyID() {
	
		String textID = textBook.getId(); 
		assertEquals("TextBookID is as initialized", "C1", 	textID);
	}
	
	@Test
	public void test_get_copyTitle() {
	
		String title = textBook.getTitle(); 
		assertEquals("title is as initialized", "Fun with Objects", title);
	}
	
	@Before
	public void setUp() throws Exception {
	}

	
	@Test
	public void test_set_title() {
		textBook = new TextBook("C1", "This is a Test Title");
		assertEquals("title failure", "This is a Test Title", textBook.getTitle());
		
		textBook.setTitle("Second edition");
		assertEquals("title not set correctly", "Second edition", textBook.getTitle());
	}

}
