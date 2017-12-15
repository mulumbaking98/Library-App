import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author maya5348
 *
 */
public class Worker {
	String Name;
    String Id;


    public Worker(String name, String id) {
        Name = name;
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public void CheckInBook (Copy c, Patron p){
        c.setStatus("IN");
        p.CheckInBook(c);
    }
    

    public void CheckOutBook (Copy c, Patron p){
        if(c.Status.equals("IN")){
            c.Status = "OUT";
            p.CheckOutBook(c);
            c.DueDate = getDate();
            System.out.println("Book is successfully checked out. Due date is - " + getDate());
        }else{
            System.out.println("Sorry: This copy has already been checked out.....");
            System.out.println("This copy is due back 0n: " + c.DueDate);
        }
    }//end check out book
    
    public String getDate(){
    	 DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
         Date dateobj = new Date();
         //System.out.println(df.format(dateobj));

         String issueDate = df.format(dateobj);

         Calendar cal = Calendar.getInstance();
         cal.add(Calendar.DATE, 10);
         Date dueDate = cal.getTime();

         String dueDateS = df.format(dueDate);
         
		return dueDateS;
    }//end get date

    public void ClearHold (Copy c, Patron p){

    }
}
