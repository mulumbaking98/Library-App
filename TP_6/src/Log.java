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
	private int logCount;
	private Worker worker;
	
	private String workerId;
	private String timeDate;
	private String event;


	  // The name of the file to open.
//  String fileName = "log.txt";

  // This will reference one line at a time
  String line = null;
  
   public Log(String workerId, String timedate, String eve) {
	 this.workerId = workerId;
	 this.timeDate = timedate;
	 this.event = eve;
   }

//public void readFile(){
//      try {
//      // FileReader reads text files in the default encoding.
//      FileReader fileReader = 
//          new FileReader(fileName);
//
//      // Always wrap FileReader in BufferedReader.
//      BufferedReader bufferedReader = 
//          new BufferedReader(fileReader);
//
//        while((line = bufferedReader.readLine()) != null) {
//          System.out.println(line);
//           }   
// 
//          // Always close files.
//           bufferedReader.close();         
//         }
//        catch(FileNotFoundException ex) {
//            System.out.println(
//                   "Unable to open file '" + 
//                   fileName + "'");                
//       }
//         catch(IOException ex) {
//            System.out.println(
//              "Error reading file '" 
//                  + fileName + "'");                  
//
//            }
//  
//      }//end readFile

   // The name of the file to open.
  //String fileName = "temp.txt";

    public static void writeFile(String workerid,String timesDate, int event){
    	
    	try(FileWriter fw = new FileWriter("log2.txt",true);
    			BufferedWriter bw = new BufferedWriter(fw);
    			PrintWriter out = new PrintWriter(bw);){
    		
    		out.println(workerid +"-"+timesDate +"-"+ Event.printEvents(event));
    		
//    		out.println(worker.getId() +"-"+GetDateDifference.getSeconds(date) +"-"+
//    				GetDateDifference.getDate() +"-"+ Event.printEvents(event));
    		
    	}catch(IOException e){
    		
    	}
    	
    	
    	
    	
    	
//    	
//        try {
//            // Assume default encoding.
//          FileWriter fileWriter =
//                new FileWriter(fileName);
//
//        // Always wrap FileWriter in BufferedWriter.
//          BufferedWriter bufferedWriter =
//                  new BufferedWriter(fileWriter);
// 
//          // Note that write() does not automatically
//         // append a newline character.
//         bufferedWriter.write(worker.getName() +": ");
//         bufferedWriter.write(worker.getId() +": ");
//         bufferedWriter.write(GetDateDifference.getDate() +": ");
//         bufferedWriter.write(GetDateDifference.getSeconds(date) +": ");
//         bufferedWriter.newLine();
//         bufferedWriter.write("We are writing");
//         bufferedWriter.write(" the text to the file.");
//
//          // Always close files.
//           bufferedWriter.close();
//        }
//        catch(IOException ex) {
//            System.out.println(
//                "Error writing to file '"
//                   + fileName + "'");
//
//         }
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

