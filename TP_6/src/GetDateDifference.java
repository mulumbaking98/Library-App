import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

/**
 * @author maya5348
 *
 */
public class GetDateDifference {
	
	public static long getTimeDifference(String d1, String  d2) {

	      Calendar cal1 = Calendar.getInstance();
	        Calendar cal2 = Calendar.getInstance();
	        
	        // Set the date for both of the calendar instance
	        StringTokenizer t = new StringTokenizer(d1,"/");
	       // ("MM/dd/yyyy"); 
	       
	        int m = Integer.parseInt(t.nextToken().trim());
	        int d = Integer.parseInt(t.nextToken().trim());
	        int y = Integer.parseInt(t.nextToken().trim());
	        
	        
	         StringTokenizer t2 = new StringTokenizer(d2,"/");
	       // ("MM/dd/yyyy"); 
	       
	        int m11 = Integer.parseInt(t2.nextToken().trim());
	        int d11 = Integer.parseInt(t2.nextToken().trim());
	        int y11 = Integer.parseInt(t2.nextToken().trim());
	        cal1.set(y, m, d);
	        cal2.set(y11, m11, d11);

	        // Get the represented date in milliseconds
	        long milis1 = cal1.getTimeInMillis();
	        long milis2 = cal2.getTimeInMillis();
	        
	        // Calculate difference in milliseconds
	        long diff = milis2 - milis1;
	        
	        // Calculate difference in seconds
	        long diffSeconds = diff / 1000;
	        
	        // Calculate difference in minutes
	        long diffMinutes = diff / (60 * 1000);
	        
	        // Calculate difference in hours
	        long diffHours = diff / (60 * 60 * 1000);
	        
	        // Calculate difference in days
	        long diffDays = diff / (24 * 60 * 60 * 1000);
	        
	       /* System.out.println("In milliseconds: " + diff + " milliseconds.");
	        System.out.println("In seconds: " + diffSeconds + " seconds.");
	        System.out.println("In minutes: " + diffMinutes + " minutes.");
	        System.out.println("In hours: " + diffHours + " hours.");
	        System.out.println("In days: " + diffDays + " days.");*/
	        
	       return diffDays;
	    }

	
//	public static String getSeconds(String d1){
//		
//		String time ="";
//		
//		   Calendar cal1 = Calendar.getInstance();
//	        Calendar cal2 = Calendar.getInstance();
//	        
//	        // Set the date for both of the calendar instance
//	        StringTokenizer t = new StringTokenizer(d1,"/");
//	       // ("MM/dd/yyyy"); 
//	       
//	        int m = Integer.parseInt(t.nextToken().trim());
//	        int d = Integer.parseInt(t.nextToken().trim());
//	        int y = Integer.parseInt(t.nextToken().trim());
//	        
//	        // Get the represented date in milliseconds
//	        long milis1 = cal1.getTimeInMillis();
//	        
//	        // Calculate  seconds
//	        long Seconds = milis1 / 1000;
//	        
//	     // Calculate difference in minutes
//	        long Minutes = milis1/ (60 * 1000);
//	        
//	        // Calculate difference in hours
//	        long Hours = milis1/ (60 * 60 * 1000);
//	          
//	        
//	        return time =  Hours +" "+ Minutes +" " + Seconds;
//     
//	}//get seconds
	
//	public static String getDate(){
//		 DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
//         Date dateobj = new Date();
//         //System.out.println(df.format(dateobj));
//
////         String issueDate = df.format(dateobj);
//
//         Calendar cal = Calendar.getInstance();
//         Date todayDate = cal.getTime();
//
//         String todayDateS = df.format(todayDate);
//         
//         return todayDateS;
//	}
	
	public static String getDate_Time(){
		String todayDateAndTime = "";
		 //getting current date and time using Date class
	       DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
	       Date dateobj = new Date();
	       System.out.println(df.format(dateobj));

	       /*getting current date time using calendar class 
	        * An Alternative of above*/
	       Calendar calobj = Calendar.getInstance();
	       
        
        return todayDateAndTime = df.format(calobj.getTime());
	}
	
	
}//end get date difference
