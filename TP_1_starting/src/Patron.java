
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

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Patron
{
	
	private String patronName;
	private String patronID;
	private ArrayList<Copy> copiesOut;

	public Patron(String id, String name)
	{
		// finish this
		this.setPatronName(name);
		this.patronID = id;
		this.copiesOut = new ArrayList<Copy>();
		
	}//end constructor
	
	

	/**
	 * @return the patronName
	 */
	public String getPatronName() {
		return patronName;
	}



	/**
	 * @param patronName the patronName to set
	 */
	public void setPatronName(String patronName) {
		this.patronName = patronName;
	}



	/**
	 * @return the patronID
	 */
	public String getPatronID() {
		return patronID;
	}



	/**
	 * @param patronID the patronID to set
	 */
	public void setPatronID(String patronID) {
		this.patronID = patronID;
	}



	/**
	 * @return the booksOut
	 */
	public ArrayList<Copy> getBooksOut() {
		return copiesOut;
	}


	
	//check for title and ID
	public boolean isBlank(Copy bk){

		return ((List<Copy>) bk.getOutTo()).isEmpty();
	}//end is blank
	
	
	
	public boolean checkBookOut(Copy b){
		// finish this
		if (b instanceof Copy && b.getOutTo().patronName == null) {
//		if (b instanceof Book && isBlank(b)) {
			 b.setOutTo(this);
		     copiesOut.add(b);
		     System.out.println(b.toString());
					
				   return true;
				}
				return false;
	}//end check out book

	public boolean checkBookIn(Copy b)
	{
		// finish this
		
		if(b instanceof Copy && b.getOutTo() == this) {
		    	b.setOutTo(new Patron(null, null));
			
			copiesOut.remove(b);
			System.out.println(b.toString());
			
			return true;
		}
		// finish this
		return false;
	}//end check in

	@Override
	public boolean equals(Object o)
	{
		// finish this: two are equals iff same patron ID
		if (o instanceof Patron) {
			if(((Patron) o).patronID == this.patronID)
				return true;
		}

		return false;
	}

	public String toString()
	{
		// finish this: return basic Patron info as String
		String res =  "Patron ID and Name: " + this.patronID + " -> " + this.getPatronName() + "\n" +
				"Books checked out: " + this.copiesOut.toString();
		
		return res;

	}
	
	
    public static void menu(){
    	
    	Patron p1 = new Patron("P47", "Eric");
    	
    	Patron p2 = FakeDB.getPatron("P47");
		Copy c1 =  FakeDB.getCopy("C1");
		Copy c2 =  FakeDB.getCopy("C2");
		
    	Scanner input = new Scanner(System.in);
		int choice = 0;
		String ch;
		String st;
		
		System.out.println("********************Welcome to the SEIS635 Library!********************");
		System.out.println("              Please Select From The Following Options:               ");
		System.out.println("**********************************************************************");
		
		while(choice != 6)
		{

			System.out.println("1: Display all books");
			System.out.println("2: Display all patrons");
			System.out.println("3: Check out book");
			System.out.println("4: Check in book");
			System.out.println("5: Exit");
			choice = input.nextInt();
			
			switch(choice)
			{
			
			case 1: //display all patrons	 
				System.out.println("********************************************");
				 System.out.println();
				 FakeDB.displayAllBooks();
				 System.out.println();
				 System.out.println("********************************************");
				  break; 
				
		   case 2: //display all books 
			      System.out.println("********************************************");
			      System.out.println();
			      FakeDB.displayAllPatrons();
			      System.out.println();
				 System.out.println("********************************************");
				  break; 
				
		   case 3: //check out a book
			    System.out.println("********************************************");
				 System.out.println();
			     p1.checkBookOut(c2);
			     System.out.println();
				 System.out.println("********************************************");
			   
				  break; 
		    case 4: //check in a book
		    	 System.out.println("********************************************");
				 System.out.println();
				 p1.checkBookIn(c2);
			     System.out.println();
				 System.out.println("********************************************");
				  break; 

		    case 5: //check in a book
				  System.exit(0);
				  break; 
				
			
			}//end switch
		}//end while
    }//end menu
    
public static void main(String[] args){
	menu();
	}//end main


}//end patron
