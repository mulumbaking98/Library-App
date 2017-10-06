import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FakeDB
{
	private static Map<String, Patron> patronStore;
	private static Map<String, Copy> copyStore;

	static // the following runs once when class is loaded: "static initializer"
	{
		patronStore = new HashMap<String, Patron>();
		copyStore = new HashMap<String, Copy>();

		patronStore.put("P1", new Patron("P1", "Eric"));
		copyStore.put("C1", new Copy("C1", "Fun with Objects"));
		copyStore.put("C2", new Copy("C2", "More Fun with Objects"));
	}

	public static Patron getPatron(String patronID)
	{
		return patronStore.get(patronID);
	}

	public static Copy getCopy(String copyID)
	{
		return copyStore.get(copyID);
	}
	
	public static  void displayAllBooks(){
		for (Entry<String, Copy> entry : copyStore.entrySet()) {
		    String key = entry.getKey();
		    Object value = entry.getValue();
		   
		    StdOut.println(entry.getKey() + ": " + entry.getValue());

		    // ...
		}
	}//end display all books
	
	public static void displayAllPatrons() {
		for (Entry<String, Patron> entry : patronStore.entrySet()) {
		    String key = entry.getKey();
		    Object value = entry.getValue();
		    StdOut.println(entry.getKey() + ": " + entry.getValue());

		}
		
	}//end display patrons

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
