/**
 * 
 * Starting class for TP-1
 * 
 * Feel free to add, modify, or delete any of the following code: it's just a
 * possible starting implementation
 * 
 * @author eric
 *
 */
public class Copy
{
	
	private String bookID;
	private String title;
	private Patron outTo;




	public Copy(String copyID, String title)
	{
		// finish this
		this.bookID = copyID;
		this.title = title;
		this.outTo = new Patron(null, null);
	}

	
	// generate getters and setters using Eclipse Source menu 
	
	
	/**
	 * @return the bookID
	 */
	public String getBookID() {
		return bookID;
	}

	/**
	 * @param bookID the bookID to set
	 */
	public void setBookID(String bookID) {
		this.bookID = bookID;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the outTo
	 */
	public Patron getOutTo() {
		return outTo;
	}
	

	/**
	 * @param outTo the outTo to set
	 */
	public void setOutTo(Patron outTo) {
		this.outTo = outTo;
	}
	
	
	public String toString()
	{
		// correctly implement this
		return "bookID: " + this.bookID + " : " +
		this.getTitle() +" |"+ " Checked out to: " + outTo.getPatronName();
		//return title + "is out to " + getOutTo();
	}

	@Override
	public boolean equals(Object o)
	{
		// finish this: two are equals iff same copy ID

		if(o instanceof Copy) {
			if (this.bookID == ((Copy) o).bookID)
				return true;
		}

		return false;
	}

}//end copy
