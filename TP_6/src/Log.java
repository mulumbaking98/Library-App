import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author maya5348
 *
 */
public class Log {
	
	private String workerId;
	private String timeDate;
	private String event;

  
   public Log(String workerId, String timedate, String eve) {
	 this.workerId = workerId;
	 this.timeDate = timedate;
	 this.event = eve;
   }


    public static void writeFile(String workerid,String timesDate, int event){
    	
    	try(FileWriter fw = new FileWriter("log2.txt",true);
    			BufferedWriter bw = new BufferedWriter(fw);
    			PrintWriter out = new PrintWriter(bw);){
    		
    		out.println(workerid +"-"+timesDate +"-"+ Event.printEvents(event));
    		
    		
    	}catch(IOException e){
    		
    	}
    	

       }//end writeFile

	/**
	 * @return the workerId
	 */
	public String getWorkerId() {
		return workerId;
	}

	/**
	 * @param workerId the workerId to set
	 */
	public void setWorkerId(String workerId) {
		this.workerId = workerId;
	}

	/**
	 * @return the event
	 */
	public String getEvent() {
		return event;
	}

	/**
	 * @param event the event to set
	 */
	public void setEvent(String event) {
		this.event = event;
	}

	/**
	 * @return the timeDate
	 */
	public String getTimeDate() {
		return timeDate;
	}

	/**
	 * @param timeDate the timeDate to set
	 */
	public void setTimeDate(String timeDate) {
		this.timeDate = timeDate;
	}

	

}//end log

