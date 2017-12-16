import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author maya5348
 *
 */
public class OverDueNotice {
	
	private static final Double PER_DAY_FINE = 10.0;
	static Patron patron;
	private String notice;
	private String returnDate;
	private double totalFine;
	private String dueDate;
	
	
    /**
	 * @return the patron
	 */
	public Patron getPatron() {
		return patron;
	}



	/**
	 * @param patron the patron to set
	 */
	public static void setPatron(Patron patron) {
		patron = patron;
	}



	/**
	 * @return the notice
	 */
	public String getNotice() {
		return notice;
	}



	/**
	 * @param notice the notice to set
	 */
	public void setNotice(String notice) {
		this.notice = notice;
	}



	/**
	 * @return the returnDate
	 */
	public String getReturnDate() {
		return returnDate;
	}



	/**
	 * @param returnDate the returnDate to set
	 */
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}



	/**
	 * @return the totalFine
	 */
	public double getTotalFine() {
		return totalFine;
	}



	/**
	 * @param totalFine the totalFine to set
	 */
	public void setTotalFine(double totalFine) {
		this.totalFine = totalFine;
	}



	/**
	 * @return the dueDate
	 */
	public String getDueDate() {
		return dueDate;
	}



	/**
	 * @param dueDate the dueDate to set
	 */
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	
	public double calculateFine(Date returnDate) {

        double totalFine = 0;
      DateFormat df = new SimpleDateFormat("MM/dd/yyyy"); 
        this.returnDate = df.format(returnDate);

                 Date dueDatee = null;   
       
		try {
            dueDatee = (Date)df.parse(dueDate);
        } catch (ParseException ex) {
           
            ex.printStackTrace();
        }
      
       long days =  GetDateDifference.getTimeDifference(this.dueDate, this.returnDate);

        if(days < 0)   
            days = 0;

       this.totalFine =  totalFine = days * this.PER_DAY_FINE;

        return totalFine;
    }

}//end over due
